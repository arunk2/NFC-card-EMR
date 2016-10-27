package com.ppltech.nfccore;

public interface INFCCard {
	public boolean initializeDevice();
	public boolean connect();
	public byte[] read();
	public boolean write(byte[] data);
}
