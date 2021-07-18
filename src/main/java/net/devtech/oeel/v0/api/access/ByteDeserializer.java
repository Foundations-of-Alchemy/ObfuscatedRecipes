package net.devtech.oeel.v0.api.access;

import java.nio.ByteBuffer;

import com.google.common.hash.HashCode;
import net.devtech.oeel.v0.api.util.IdentifierPacker;

public interface ByteDeserializer<T> {
	/**
	 * must be packable by {@link IdentifierPacker}.
	 * The easiest way to ensure uniqueness is to put your mod id in the string and some unique-ifier. Eg. "oeel/tex"
	 * @see IdentifierPacker#pack(String)
	 */
	String magic();

	T newInstance();

	void read(T instance, ByteBuffer buffer, HashCode inputHash);
}
