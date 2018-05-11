package factory;

public class MobileFactory {
	public static Telefonos createMobile(String type){
		if(type.equals(Telefonos.IPHONE)){
			return new IPhone(2, "A9", "A9 GPu");
		}else if(type.equals(Telefonos.SONY)){
			return new Sony(2,"ARM");
		}else if(type.equals(Telefonos.SAMSUNG)){
			return new Samsung("Intel");
		}else if (type.equals(Telefonos.LANIX)){
                        return new Lanix(4, "Android", 64);
                } else if (type.equals(Telefonos.ASUS)){
                        return new Asus(4, 128, "Android");
                } else if (type.equals(Telefonos.VORAGO)){
                        return new Vorago (4, "SnapDragon 800");
                }else{
                    return null;
                }
	}
}
