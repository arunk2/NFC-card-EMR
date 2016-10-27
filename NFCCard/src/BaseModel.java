

public class BaseModel {
	
	public byte[] toByteArray() {
		return Convertor.toBtyeArray(this);
	}
	
	public Object toObject(byte[] bytes) {
		return Convertor.toObject(bytes, this.getClass());
	}

}
