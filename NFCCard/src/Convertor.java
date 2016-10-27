
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;


public class Convertor {

	public static byte[] toBtyeArray(Object obj) {
		byte[] bytes = null;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(bos);
//			oos.writeObject(obj);
			
            Class cls = obj.getClass();
            
            Field fieldlist[] = cls.getDeclaredFields();
            for (int i = 0; i < fieldlist.length; i++) {
                Field fld = fieldlist[i];
                if (fld.getType() == java.lang.Character.class)
                	oos.writeByte((Character)fld.get(obj));
                if (fld.getType() == java.lang.Short.class) 
                	oos.writeInt((Short)fld.get(obj));
                if (fld.getType() == java.lang.Integer.class)
                	oos.writeInt((Integer)fld.get(obj));
                if (fld.getType() == java.lang.Long.class)
                	oos.writeLong((Long)fld.get(obj));
                if (fld.getType() == java.lang.Float.class)
                	oos.writeFloat((Float)fld.get(obj));
                if (fld.getType() == java.lang.Double.class)
                	oos.writeDouble((Double)fld.get(obj));
//                if (fld.getType() == java.lang.String.class)
//                	oos.writeChars((String)fld.get(obj));
                if (fld.getType() == java.lang.Character[].class) {
                	Character[] str = (Character[])fld.get(obj);
                	for (Character ch : str) {
                		oos.writeByte(ch);
                	}
                }
            }            
			
			oos.flush();
			oos.close();
			bos.close();
			bytes = bos.toByteArray();
			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return bytes;
	}
	
	public static Object toObject(byte[] bytes, Class cls) {
		Object obj = null;
		
		try {
			obj = cls.newInstance();
		
			ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
            Field fieldlist[] = cls.getDeclaredFields();
            for (int i = 0; i < fieldlist.length; i++) {
                Field fld = fieldlist[i];
                
                if (fld.getType() == java.lang.Character.class)
                	fld.set(obj, ois.readChar());
                if (fld.getType() == java.lang.Short.class) 
                	fld.set(obj, ois.readShort());
                if (fld.getType() == java.lang.Integer.class)
                	fld.set(obj, ois.readInt());
                if (fld.getType() == java.lang.Long.class)
                	fld.set(obj, ois.readLong());
                if (fld.getType() == java.lang.Float.class)
                	fld.set(obj, ois.readFloat());
                if (fld.getType() == java.lang.Double.class)
                	fld.set(obj, ois.readDouble());
//                if (fld.getType() == java.lang.String.class)
//                	fld.set(obj, ois.readChar());
                if (fld.getType() == java.lang.Character[].class) {
                	Character[] str = (Character[])fld.get(obj);
                	for (int j = 0; j < str.length; j++) {
                		str[j] = (char) ois.readByte();
                		
                	}
                	fld.set(obj, str);
                }
            }            

		}
		catch (IOException ex) {
			ex.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return obj;
	}
}
