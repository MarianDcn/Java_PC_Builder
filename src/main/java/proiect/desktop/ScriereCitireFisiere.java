package proiect.desktop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ScriereCitireFisiere {

    public static void writeObjectsToFilePlacaVideo() {
        
	PlacaVideo placaVideo1 = new PlacaVideo("Gigabyte", "NVIDIA RTX 3080", 16, "PCI Express 4.0", "7680x4320", 1500.0);
        PlacaVideo placaVideo2 = new PlacaVideo("MSI", "AMD RX 6800 XT", 16, "PCI Express 4.0", "7680x4320", 1700.0);
        PlacaVideo placaVideo3 = new PlacaVideo("Gigabyte", "NVIDIA GTX 1660 Super", 6, "PCI Express 3.0", "1920x1080", 300.0);
        PlacaVideo placaVideo4 = new PlacaVideo("MSI", "AMD RX 5700 XT", 4, "PCI Express 4.0", "2560x1440", 1200.0);
        PlacaVideo placaVideo5 = new PlacaVideo("Gigabyte", "NVIDIA GTX 1650", 4, "PCI Express 3.0", "2560x1600", 200.0);
        
	try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("PlacaVideoObjects.dat"))) {
           
            outputStream.writeObject(placaVideo1);
            outputStream.writeObject(placaVideo2);
            outputStream.writeObject(placaVideo3);
            outputStream.writeObject(placaVideo4);
            outputStream.writeObject(placaVideo5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readObjectsFromFilePlacaVideo() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("PlacaVideoObjects.dat"))) {

            PlacaVideo readPlacaVideo1 = (PlacaVideo) inputStream.readObject();
            PlacaVideo readPlacaVideo2 = (PlacaVideo) inputStream.readObject();
            PlacaVideo readPlacaVideo3 = (PlacaVideo) inputStream.readObject();
            PlacaVideo readPlacaVideo4 = (PlacaVideo) inputStream.readObject();
            PlacaVideo readPlacaVideo5 = (PlacaVideo) inputStream.readObject();
            
            System.out.println(readPlacaVideo1);
            System.out.println(readPlacaVideo2);
            System.out.println(readPlacaVideo3);
            System.out.println(readPlacaVideo4);
            System.out.println(readPlacaVideo5);
            System.out.println(" ");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
   
    public static void writeObjectsToFilePlacaDeSunet() {
        
        PlacaDeSunet placaSunet1 = new PlacaDeSunet("Creative", 4, 120, true, true, 250.0);
        PlacaDeSunet placaSunet2 = new PlacaDeSunet("Logitech", 5, 110, false, true, 180.0);
        PlacaDeSunet placaSunet3 = new PlacaDeSunet("ASUS", 7, 115, true, false, 300.0);
        PlacaDeSunet placaSunet4 = new PlacaDeSunet("Sennheiser", 8, 125, false, true, 400.0);
        PlacaDeSunet placaSunet5 = new PlacaDeSunet("SteelSeries", 9, 105, true, false, 150.0);
        
	try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("PlacaDeSunetObjects.dat"))) {
           
            outputStream.writeObject(placaSunet1);
            outputStream.writeObject(placaSunet2);
            outputStream.writeObject(placaSunet3);
            outputStream.writeObject(placaSunet4);
            outputStream.writeObject(placaSunet5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readObjectsFromFilePlacaDeSunet() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("PlacaDeSunetObjects.dat"))) {

            PlacaDeSunet readPlacaSunet1 = (PlacaDeSunet) inputStream.readObject();
            PlacaDeSunet readPlacaSunet2 = (PlacaDeSunet) inputStream.readObject();
            PlacaDeSunet readPlacaSunet3 = (PlacaDeSunet) inputStream.readObject();
            PlacaDeSunet readPlacaSunet4 = (PlacaDeSunet) inputStream.readObject();
            PlacaDeSunet readPlacaSunet5 = (PlacaDeSunet) inputStream.readObject();

            System.out.println(readPlacaSunet1);
            System.out.println(readPlacaSunet2);
            System.out.println(readPlacaSunet3);
            System.out.println(readPlacaSunet4);
            System.out.println(readPlacaSunet5);
            System.out.println(" ");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void writeObjectsToFileProcesor() {
        Procesor procesor4 = new Procesor("Intel",9,11900, "K", 5.3f, 8, 16, "LGA1200", 550.0);
        Procesor procesor5 = new Procesor("AMD",9,5950, "X", 4.9f, 16, 64, "AM4", 800.0);
        Procesor procesor6 = new Procesor("Intel",7,11700, "K", 5.0f, 8, 16, "LGA1200", 400.0);
        Procesor procesor7 = new Procesor("AMD",5,5600, "X", 4.6f, 6, 32, "AM4", 300.0);
        Procesor procesor8 = new Procesor("Intel",5,11400, "", 4.4f, 6, 12, "LGA1200", 250.0);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("ProcesorObjects.dat"))) {
            outputStream.writeObject(procesor4);
            outputStream.writeObject(procesor5);
            outputStream.writeObject(procesor6);
            outputStream.writeObject(procesor7);
            outputStream.writeObject(procesor8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readObjectsFromFileProcesor() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("ProcesorObjects.dat"))) {
            Procesor readProcesor1 = (Procesor) inputStream.readObject();
            Procesor readProcesor2 = (Procesor) inputStream.readObject();
            Procesor readProcesor3 = (Procesor) inputStream.readObject();
            Procesor readProcesor4 = (Procesor) inputStream.readObject();
            Procesor readProcesor5 = (Procesor) inputStream.readObject();

            System.out.println( readProcesor1);
            System.out.println(readProcesor2);
           System.out.println( readProcesor3);
            System.out.println(readProcesor4);
            System.out.println( readProcesor5);
            System.out.println(" ");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void writeObjectsToFilePlacaDeBaza() {
        PlacaDeBaza placa4 = new PlacaDeBaza("Asus", "LGA1200", "Intel Z490", "DDR4", 64, 5000, 10, 600);
        PlacaDeBaza placa5 = new PlacaDeBaza("Gigabyte", "AM4", "AMD B450", "DDR4", 32, 3600, 6, 300);
        PlacaDeBaza placa6 = new PlacaDeBaza("MSI", "LGA1151", "Intel H310", "DDR4", 16, 2666, 4, 150);
        PlacaDeBaza placa7 = new PlacaDeBaza("ASRock", "AM4", "AMD X570", "DDR4", 128, 6000, 8, 800);
        PlacaDeBaza placa8 = new PlacaDeBaza("Biostar", "LGA1200", "Intel B460", "DDR3", 32, 3200, 4, 400);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("PlacaDeBazaObjects.dat"))) {
            outputStream.writeObject(placa4);
            outputStream.writeObject(placa5);
            outputStream.writeObject(placa6);
            outputStream.writeObject(placa7);
            outputStream.writeObject(placa8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readObjectsFromFilePlacaDeBaza() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("PlacaDeBazaObjects.dat"))) {
            PlacaDeBaza readPlacaDeBaza1 = (PlacaDeBaza) inputStream.readObject();
            PlacaDeBaza readPlacaDeBaza2 = (PlacaDeBaza) inputStream.readObject();
            PlacaDeBaza readPlacaDeBaza3 = (PlacaDeBaza) inputStream.readObject();
            PlacaDeBaza readPlacaDeBaza4 = (PlacaDeBaza) inputStream.readObject();
            PlacaDeBaza readPlacaDeBaza5 = (PlacaDeBaza) inputStream.readObject();

            System.out.println( readPlacaDeBaza1);
            System.out.println( readPlacaDeBaza2);
            System.out.println( readPlacaDeBaza3);
            System.out.println( readPlacaDeBaza4);
            System.out.println( readPlacaDeBaza5);
            System.out.println(" ");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void writeObjectsToFileSursa() {
     
        Sursa sursa4 = new Sursa("EVGA", "ATX",550,120);
        Sursa sursa5 = new Sursa("ASUS", "Micro-ATX",950,130);
        Sursa sursa6 = new Sursa("EVGA", "Mini-ITX",650,100);
        Sursa sursa7 = new Sursa("ASUS", "ATX",800,150);
        Sursa sursa8 = new Sursa("EVGA", "ATX",800,110); 
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("SursaObjects.dat"))) {
           
            outputStream.writeObject(sursa4);
            outputStream.writeObject(sursa5);
            outputStream.writeObject(sursa6);
            outputStream.writeObject(sursa7);
            outputStream.writeObject(sursa8);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readObjectsFromFileSursa() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("SursaObjects.dat"))) {
            
            Sursa s1 = (Sursa) inputStream.readObject();
            Sursa s2 = (Sursa) inputStream.readObject();
            Sursa s3 = (Sursa) inputStream.readObject();
            Sursa s4 = (Sursa) inputStream.readObject();
            Sursa s5 = (Sursa) inputStream.readObject();
           
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
            System.out.println(s5);
            System.out.println(" ");
           
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void writeObjectsToFileCarcasa() {
        Carcasa carcasa4 = new Carcasa("Corsair", "Mid Tower", "ATX", "Negru", 3, 2, 8f, 350);
        Carcasa carcasa5 = new Carcasa("NZXT", "Full Tower", "E-ATX", "Negru", 5, 3, 7f, 500);
        Carcasa carcasa6 = new Carcasa("Cooler Master", "Mini Tower", "Micro-ATX", "Negru", 2, 1, 4f, 150);
        Carcasa carcasa7 = new Carcasa("Fractal Design", "Mid Tower", "ATX", "Rosu", 4, 2, 6f, 280);
        Carcasa carcasa8 = new Carcasa("Thermaltake", "Full Tower", "ATX", "Alb", 6, 4, 12f, 600);
        
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("CarcasaObjects.dat"))) {
            outputStream.writeObject(carcasa4);
            outputStream.writeObject(carcasa5);
            outputStream.writeObject(carcasa6);
            outputStream.writeObject(carcasa7);
            outputStream.writeObject(carcasa8);
          
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readObjectsFromFileCarcasa()     {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("CarcasaObjects.dat"))) {
            
            Carcasa c1=(Carcasa) inputStream.readObject();
            Carcasa c2=(Carcasa) inputStream.readObject();
            Carcasa c3=(Carcasa) inputStream.readObject();
            Carcasa c4=(Carcasa) inputStream.readObject();
            Carcasa c5=(Carcasa) inputStream.readObject();
            
            System.out.println( c1);
            System.out.println(c2);
            System.out.println( c3);
            System.out.println(c4);
            System.out.println( c5);
            System.out.println(" ");
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void writeObjectsToFileMemorieRAM() {
        MemorieRAM memorie3 = new MemorieRAM("Corsair", "DDR3", 8, 1333, 1.35, "CL16", 50);
        MemorieRAM memorie4 = new MemorieRAM("Kingston", "DDR3", 16, 1600, 1.20, "CL15", 100);
        MemorieRAM memorie5 = new MemorieRAM("ADATA", "DDR3", 32, 1600, 1.35, "CL16", 200);
        MemorieRAM memorie6 = new MemorieRAM("Corsair", "DDR4", 64, 3200, 1.35, "CL16", 700);
        MemorieRAM memorie7 = new MemorieRAM("Kingston", "DDR4", 8, 3200, 1.20, "CL15", 100);
        
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("MemorieRAMObjects.dat"))) {
            outputStream.writeObject(memorie3);
            outputStream.writeObject(memorie4);
            outputStream.writeObject(memorie5);
            outputStream.writeObject(memorie6);
            outputStream.writeObject(memorie7);
          
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readObjectsFromFileMemorieRAM() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("MemorieRAMObjects.dat"))) {
            
            MemorieRAM m1=(MemorieRAM) inputStream.readObject();
            MemorieRAM m2=(MemorieRAM) inputStream.readObject();
            MemorieRAM m3=(MemorieRAM) inputStream.readObject();
            MemorieRAM m4=(MemorieRAM) inputStream.readObject();
            MemorieRAM m5=(MemorieRAM) inputStream.readObject();
            
            System.out.println( m1);
            System.out.println(m2);
            System.out.println( m3);
            System.out.println(m4);
            System.out.println( m5);
             System.out.println(" ");
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void writeObjectsToFileHardDisk() {
     
        HardDisk hard3 = new HardDisk("Seagate", 1000, 5400, 32, "SATA", 2.5, 200);
        HardDisk hard4 = new HardDisk("Kingston", 500, 7200, 128, "SATA", 2.5, 150);
        HardDisk hard5 = new HardDisk("Samsung", 500, 5400, 256, "SATA", 3.5, 150);
        HardDisk hard6 = new HardDisk("Western Digital", 500, 7200, 64, "SATA", 3.5, 150);
        HardDisk hard7 = new HardDisk("Seagate", 500, 5400, 32, "SATA", 2.5, 100);   
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("HardDiskObjects.dat"))) {
           
            outputStream.writeObject(hard3);
            outputStream.writeObject(hard4);
            outputStream.writeObject(hard5);
            outputStream.writeObject(hard6);
            outputStream.writeObject(hard7);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readObjectsFromFileHardDisk() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("HardDiskObjects.dat"))) {
            
            HardDisk h1 = (HardDisk) inputStream.readObject();
            HardDisk h2 = (HardDisk) inputStream.readObject();
            HardDisk h3 = (HardDisk) inputStream.readObject();
            HardDisk h4 = (HardDisk) inputStream.readObject();
            HardDisk h5 = (HardDisk) inputStream.readObject();
           
            System.out.println(h1);
            System.out.println(h2);
            System.out.println(h3);
            System.out.println(h4);
            System.out.println(h5);
            System.out.println(" ");
           
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }   
}
