

public interface INFCCard {
	public boolean initializeDevice();
	public boolean connect();
	public byte[] read(int size);
	public boolean write(byte[] data);
}
