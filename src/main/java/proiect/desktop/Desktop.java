package proiect.desktop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.Arrays;
import java.util.Scanner;
public class Desktop {
    /*
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
    */
    public static void main(String[] args) {
        
       
    

   
        //Scanner scanner = new Scanner(System.in);
      
        //Procesor
       
        /*
        { 
        System.out.println("\nVector Procesor:");
        Procesor procesor4 = new Procesor("Intel",9,11900, "K", 5.3f, 8, 16, "LGA1200", 550.0);
        Procesor procesor5 = new Procesor("AMD",9,5950, "X", 4.9f, 16, 64, "AM4", 800.0);
        Procesor procesor6 = new Procesor("Intel",7,11700, "K", 5.0f, 8, 16, "LGA1200", 400.0);
        Procesor procesor7 = new Procesor("AMD",5,5600, "X", 4.6f, 6, 32, "AM4", 300.0);
        Procesor procesor8 = new Procesor("Intel",5,11400, "", 4.4f, 6, 12, "LGA1200", 250.0);
        Procesor procesor9 = new Procesor("AMD",7,5800, "X", 4.7f, 8, 32, "AM4", 600.0);
        Procesor procesor10 = new Procesor("Intel",9,10900, "K", 5.3f, 10, 20, "LGA1200", 700.0);
        Procesor procesor11 = new Procesor("AMD",3,3300, "X", 4.3f, 4, 16, "AM4", 150.0);
        Procesor procesor12 = new Procesor("Intel",3,10100, "", 4.3f, 4, 8, "LGA1200", 120.0);
        Procesor procesor13 = new Procesor("AMD",5,3600, "", 4.2f, 6, 32, "AM4", 200.0);
        Procesor[] vectorProcesor = {procesor4,procesor5,procesor6,procesor7,procesor8,procesor9,procesor10,procesor11,procesor12,procesor13};
        for(int i=0;i<vectorProcesor.length;i++)
       { 
           System.out.println(vectorProcesor[i]);
       }
        
        
        System.out.println("1. producator, generatie");
        System.out.println("2. producator, frecventa");
        System.out.println("3. producator, nrNuclee");
        System.out.println("4. producator, memorieCache");
        System.out.println("5. producator, socket");
        System.out.println("6. producator, pret");
        System.out.println("7. generatie, frecventa");
        System.out.println("8. generatie, nrNuclee");
        System.out.println("9. generatie, memorieCache");
        System.out.println("10. generatie, socket");
        System.out.println("11. generatie, pret");
        System.out.println("12. frecventa, nrNuclee");
        System.out.println("13. frecventa, memorieCache");
        System.out.println("14. frecventa, socket");
        System.out.println("15. frecventa, pret");
        System.out.println("16. nrNuclee, memorieCache");
        System.out.println("17. nrNuclee, socket");
        System.out.println("18. nrNuclee, pret");
        System.out.println("19. memorieCache, socket");
        System.out.println("20. memorieCache, pret");
        System.out.println("21. socket, pret");
        
        System.out.println("Alege o optiune:");
        int optiuneProcesor = scanner.nextInt();
        scanner.nextLine();
        
        switch (optiuneProcesor) {
            case 1:{
                System.out.println("1. producator, generatie");
                System.out.println("Introdu producatorul:");
                String producator=scanner.nextLine();
                System.out.println("Introduceti generatia:");
                String generatie=scanner.nextLine();
                for(int i=0;i<vectorProcesor.length;i++)
                {if(vectorProcesor[i].getProducator().equals(producator) && vectorProcesor[i].getGeneratie().equals(generatie)==true) 
                System.out.println(vectorProcesor[i]);
                }
                break;}
            case 2:{
                System.out.println("2. producator, frecventa");
                System.out.println("Introdu producatorul:");
                String producator=scanner.nextLine();
                System.out.println("Introduceti frecventa minima:");
                float frecventa=scanner.nextFloat();
                for(int i=0;i<vectorProcesor.length;i++)
                {if(vectorProcesor[i].getProducator().equals(producator)==true && vectorProcesor[i].getFrecventa()>=frecventa) 
                System.out.println(vectorProcesor[i]);
                }
                break;}
            case 3:{
                System.out.println("3. producator, nrNuclee");
                System.out.println("Introdu producatorul:");
                String producator=scanner.nextLine();
                System.out.println("Introduceti numarul minim de nuclee:");
                int nrNuclee=scanner.nextInt();
                for(int i=0;i<vectorProcesor.length;i++)
                {if(vectorProcesor[i].getProducator().equals(producator)==true && vectorProcesor[i].getNrNuclee()>=nrNuclee) 
                System.out.println(vectorProcesor[i]);}
                break;
                }
            case 4:{
                System.out.println("4. producator, memorieCache");
                System.out.println("Introdu producatorul:");
                String producator=scanner.nextLine();
                System.out.println("Introduceti memoria cache minim:");
                int memorieCache=scanner.nextInt();
                for(int i=0;i<vectorProcesor.length;i++)
                {if(vectorProcesor[i].getProducator().equals(producator)==true && vectorProcesor[i].getMemorieCache()>=memorieCache) 
                System.out.println(vectorProcesor[i]);}
                break;}
            case 5:{
                System.out.println("5. producator, socket");
                System.out.println("Introdu producatorul:");
                String producator=scanner.nextLine();
                System.out.println("Introduceti socket-ul:");
                String socket=scanner.nextLine();
                for(int i=0;i<vectorProcesor.length;i++)
                {if(vectorProcesor[i].getProducator().equals(producator)==true && vectorProcesor[i].getSocket().equals(socket)==true) 
                System.out.println(vectorProcesor[i]);}
                break;}
            case 6:{
                System.out.println("6. producator, pret");
                System.out.println("Introduceti producatorul:");
                String producator=scanner.nextLine();
                System.out.println("Introduceti pretul maxim:");
                double pret=scanner.nextDouble();
                for(int i=0;i<vectorProcesor.length;i++)
                {if(vectorProcesor[i].getProducator().equals(producator)==true && vectorProcesor[i].getPret()<=pret) 
                System.out.println(vectorProcesor[i]);}
                break;}
            case 7:{
                System.out.println("7. generatie, frecventa");
                System.out.println("Introduceti generatia:");
                String generatie=scanner.nextLine();
                System.out.println("Introduceti frecventa minima:");
                 float frecventaMinima=scanner.nextFloat();
                for(int i=0;i<vectorProcesor.length;i++)
                {if(vectorProcesor[i].getGeneratie().equals(generatie)==true && vectorProcesor[i].getFrecventa()>=frecventaMinima) 
                System.out.println(vectorProcesor[i]);}
                break;}
            case 8:{
                System.out.println("8. generatie, nrNuclee");
                System.out.println("Introduceti generatia:");
                String generatie=scanner.nextLine();
                System.out.println("Introduceti numarul minim de nuclee:");
                int nrNuclee=scanner.nextInt();
                for(int i=0;i<vectorProcesor.length;i++)
                {if(vectorProcesor[i].getGeneratie().equals(generatie)==true && vectorProcesor[i].getNrNuclee()>=nrNuclee) 
                System.out.println(vectorProcesor[i]);}
                break;}
            case 9:{
                System.out.println("9. generatie, memorieCache");
                System.out.println("Introduceti generatia:");
                String generatie=scanner.nextLine();
                System.out.println("Introduceti memoria cache minima:");
                int memorieCache=scanner.nextInt();
                for(int i=0;i<vectorProcesor.length;i++)
                {if(vectorProcesor[i].getGeneratie().equals(generatie)==true && vectorProcesor[i].getMemorieCache()>=memorieCache) 
                System.out.println(vectorProcesor[i]);}
                break;}
            case 10:{
                System.out.println("10. generatie, socket");
                System.out.println("Introduceti generatia:");
                String generatie=scanner.nextLine();
                System.out.println("Introduceti socket-ul:");
                String socket=scanner.nextLine();
                for(int i=0;i<vectorProcesor.length;i++)
                {if(vectorProcesor[i].getGeneratie().equals(generatie)==true && vectorProcesor[i].getSocket().equals(socket)) 
                System.out.println(vectorProcesor[i]);}
                break;}
            case 11:{
                System.out.println("11. generatie, pret");
                System.out.println("Introduceti generatia:");
                String generatie=scanner.nextLine();
                System.out.println("Introduceti pretul maxim:");
                double pret=scanner.nextDouble();
                for(int i=0;i<vectorProcesor.length;i++)
                {if(vectorProcesor[i].getGeneratie().equals(generatie)==true && vectorProcesor[i].getPret()<=pret) 
                System.out.println(vectorProcesor[i]);}
                break;}
            case 12:{
                System.out.println("12. frecventa, nrNuclee");
                System.out.println("Introduceti frecventa minima:");
                float frecventaMinima=scanner.nextFloat();
                System.out.println("Introduceti numarul minim de nuclee:");
                int nrNuclee=scanner.nextInt();
                for(int i=0;i<vectorProcesor.length;i++)
                {if(vectorProcesor[i].getFrecventa()>=frecventaMinima && vectorProcesor[i].getNrNuclee()>=nrNuclee) 
                System.out.println(vectorProcesor[i]);}
                break;}
            case 13:{
                System.out.println("13. frecventa, memorieCache");
                System.out.println("Introduceti frecventa minima:");
                float frecventaMinima=scanner.nextFloat();
                System.out.println("Introduceti memorie cache minimca:");
                int memorieCache=scanner.nextInt();
                for(int i=0;i<vectorProcesor.length;i++)
                {if(vectorProcesor[i].getFrecventa()>=frecventaMinima && vectorProcesor[i].getMemorieCache()>=memorieCache)
                System.out.println(vectorProcesor[i]);}
                break;}
            case 14:{
                System.out.println("14. frecventa, socket");
                System.out.println("Introduceti frecventa minima:");
                float frecventaMinima=scanner.nextFloat();
                scanner.nextLine();
                System.out.println("Introduceti socket-ul:");
                String socket=scanner.nextLine();
                for(int i=0;i<vectorProcesor.length;i++)
                {if(vectorProcesor[i].getFrecventa()>=frecventaMinima && vectorProcesor[i].getSocket().equals(socket)==true)
                System.out.println(vectorProcesor[i]);}
                break;}
            case 15:{
                System.out.println("15. frecventa, pret");
                System.out.println("Introduceti frecventa minima:");
                float frecventaMinima=scanner.nextFloat();
                System.out.println("Introduceti pretul maxim:");
                double pret=scanner.nextDouble();
                for(int i=0;i<vectorProcesor.length;i++)
                {if(vectorProcesor[i].getFrecventa()>=frecventaMinima && vectorProcesor[i].getPret()<=pret)
                System.out.println(vectorProcesor[i]);}
                break;}
            case 16:{
                System.out.println("16. nrNuclee, memorieCache");
                System.out.println("Introduceti numarul minim de nuclee:");
                int nrNuclee=scanner.nextInt();
                System.out.println("Introduceti memoria cache minima:");
                int memorieCache=scanner.nextInt();
                for(int i=0;i<vectorProcesor.length;i++)
                {if(vectorProcesor[i].getNrNuclee()>=nrNuclee && vectorProcesor[i].getMemorieCache()>=memorieCache)
                System.out.println(vectorProcesor[i]);}
                break;}
            case 17:{
                System.out.println("17. nrNuclee, socket");
                System.out.println("Introduceti numarul minim de nuclee:");
                int nrNuclee=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduceti socket-ul:");
                String socket=scanner.nextLine();
                for(int i=0;i<vectorProcesor.length;i++)
                {if(vectorProcesor[i].getNrNuclee()>=nrNuclee && vectorProcesor[i].getSocket().equals(socket)==true)
                System.out.println(vectorProcesor[i]);}
                break;}
            case 18:{
                System.out.println("18. nrNuclee, pret");
                System.out.println("Introduceti numarul minim de nuclee:");
                int nrNuclee=scanner.nextInt();
                System.out.println("Introduceti pretul maxim:");
                Double pret=scanner.nextDouble();
                for(int i=0;i<vectorProcesor.length;i++)
                {if(vectorProcesor[i].getNrNuclee()>=nrNuclee && vectorProcesor[i].getPret()<=pret)
                System.out.println(vectorProcesor[i]);}
                break;}
            case 19:{
                System.out.println("19. memorieCache, socket");
                System.out.println("Introduceti memoria cache minima:");
                int memorieCache=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduceti socket-ul:");
                String socket=scanner.nextLine();
                for(int i=0;i<vectorProcesor.length;i++)
                {if(vectorProcesor[i].getMemorieCache()>=memorieCache && vectorProcesor[i].getSocket().equals(socket)==true)
                System.out.println(vectorProcesor[i]);}
                break;}
            case 20:{
                System.out.println("20. memorieCache, pret");
                System.out.println("Introduceti memoria cache minima:");
                int memorieCache=scanner.nextInt();
                System.out.println("Introduceti pretul maxim:");
                double pret=scanner.nextDouble();
                for(int i=0;i<vectorProcesor.length;i++)
                {if(vectorProcesor[i].getMemorieCache()>=memorieCache && vectorProcesor[i].getPret()<=pret)
                System.out.println(vectorProcesor[i]);}
                break;}
            case 21:{
                System.out.println("21. socket, pret");
                System.out.println("Introduceti pretul maxim:");
                String socket=scanner.nextLine();
                System.out.println("Introduceti pretul maxim:");
                Double pret=scanner.nextDouble();
                for(int i=0;i<vectorProcesor.length;i++)
                {if(vectorProcesor[i].getSocket().equals(socket)==true && vectorProcesor[i].getPret()<=pret)
                System.out.println(vectorProcesor[i]);}
                break;}
            default:
                System.out.println("Optiune invalida");
                break;
        }
        */
        
        /*
        //Placa de baza
        {
        System.out.println("\nVector PlacaDeBaza:");
        PlacaDeBaza placa4 = new PlacaDeBaza("Asus", "LGA1200", "Intel Z490", "DDR4", 64, 5000, 10, 600);
        PlacaDeBaza placa5 = new PlacaDeBaza("Gigabyte", "AM4", "AMD B450", "DDR4", 32, 3600, 6, 300);
        PlacaDeBaza placa6 = new PlacaDeBaza("MSI", "LGA1151", "Intel H310", "DDR4", 16, 2666, 4, 150);
        PlacaDeBaza placa7 = new PlacaDeBaza("ASRock", "AM4", "AMD X570", "DDR4", 128, 6000, 12, 800);
        PlacaDeBaza placa8 = new PlacaDeBaza("Biostar", "LGA1200", "Intel B460", "DDR4", 32, 3200, 8, 400);
        PlacaDeBaza placa9 = new PlacaDeBaza("ECS", "AM4", "AMD A520", "DDR4", 16, 3000, 6, 250);
        PlacaDeBaza placa10 = new PlacaDeBaza("Colorful", "LGA1151", "Intel Z390", "DDR4", 64, 4400, 10, 550);
        PlacaDeBaza placa11 = new PlacaDeBaza("Aorus", "AM4", "AMD B550", "DDR4", 128, 6400, 14, 900);
        PlacaDeBaza placa12 = new PlacaDeBaza("ASUS ROG", "LGA1200", "Intel Z590", "DDR4", 64, 5600, 12, 750);
        PlacaDeBaza placa13 = new PlacaDeBaza("MSI MPG", "AM4", "AMD X470", "DDR4", 32, 3800, 8, 500);
        PlacaDeBaza[] vectorPlacaDeBaza = {placa4,placa5,placa6,placa7,placa8,placa9,placa10,placa11,placa12,placa13}; 
        for(int i=0;i<vectorPlacaDeBaza.length;i++)
       { 
           System.out.println(vectorPlacaDeBaza[i]);
       }
        System.out.println("1. socket, chipset");
        System.out.println("2. socket, tipMemorie");
        System.out.println("3. socket, capacitateMemorie");
        System.out.println("4. socket, rataTransfer");
        System.out.println("5. socket, porturiUSB");
        System.out.println("6. socket, producator");
        System.out.println("7. socket, pret");
        System.out.println("8. chipset, tipMemorie");
        System.out.println("9. chipset, capacitateMemorie");
        System.out.println("10. chipset, rataTransfer");
        System.out.println("11. chipset, porturiUSB");
        System.out.println("12. chipset, producator");
        System.out.println("13. chipset, pret");
        System.out.println("14. tipMemorie, capacitateMemorie");
        System.out.println("15. tipMemorie, rataTransfer");
        System.out.println("16. tipMemorie, porturiUSB");
        System.out.println("17. tipMemorie, producator");
        System.out.println("18. tipMemorie, pret");
        System.out.println("19. capacitateMemorie, rataTransfer");
        System.out.println("20. capacitateMemorie, porturiUSB");
        System.out.println("21. capacitateMemorie, producator");
        System.out.println("22. capacitateMemorie, pret");
        System.out.println("23. rataTransfer, porturiUSB");
        System.out.println("24. rataTransfer, producator");
        System.out.println("25. rataTransfer, pret");
        System.out.println("26. porturiUSB, producator");
        System.out.println("27. porturiUSB, pret");
        System.out.println("28. producator, pret");        
        System.out.println("Alege o optiune:");
        int optiunePlacaDeBaza = scanner.nextInt();
        scanner.nextLine();
        
        switch (optiunePlacaDeBaza) {
            case 1:{
                System.out.println("1. socket, chipset");
                System.out.println("Introduceti socket-ul:");
                String socket=scanner.nextLine();
                System.out.println("Introduceti chipset-ul:");
                String chipset=scanner.nextLine();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getSocket().equals(socket)==true && vectorPlacaDeBaza[i].getChipset().equals(chipset)==true) 
                System.out.println(vectorPlacaDeBaza[i]);
                }
                break;}
            case 2:{
                System.out.println("2. socket, tipMemorie");
                System.out.println("Introduceti socket-ul:");
                String socket=scanner.nextLine();
                System.out.println("Introduceti tipul memoriei:");
                String tipMemorie=scanner.nextLine();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getSocket().equals(socket)==true && vectorPlacaDeBaza[i].getTipMemorie().equals(tipMemorie)==true) 
                System.out.println(vectorPlacaDeBaza[i]);
                }
                break;}
            case 3:{
                System.out.println("3. socket, capacitateMemorie");
                System.out.println("Introduceti socket-ul:");
                String socket=scanner.nextLine();
                System.out.println("Introduceti capacitatea minima a memoriei:");
                int capacitateMemorie=scanner.nextInt();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getSocket().equals(socket)==true && vectorPlacaDeBaza[i].getCapacitateMemorie()>=capacitateMemorie) 
                System.out.println(vectorPlacaDeBaza[i]);}
                break;
                }
            case 4:{
                System.out.println("4. socket, rataTransfer");
                System.out.println("Introduceti socket-ul:");
                String socket=scanner.nextLine();
                System.out.println("Introduceti rata de transfer minima:");
                int rataTransfer=scanner.nextInt();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getSocket().equals(socket)==true && vectorPlacaDeBaza[i].getRataTransfer()>=rataTransfer) 
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 5:{
                System.out.println("5. socket, porturiUSB");
                System.out.println("Introduceti socket-ul:");
                String socket=scanner.nextLine();
                System.out.println("Introduceti numarul de porturi:");
                int porturiUSB=scanner.nextInt();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getSocket().equals(socket)==true && vectorPlacaDeBaza[i].getPorturiUSB()>=porturiUSB) 
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 6:{
                System.out.println("6. socket, producator");
                System.out.println("Introduceti socket-ul:");
                String socket=scanner.nextLine();
                System.out.println("Introduceti producatorul:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getSocket().equals(socket)==true && vectorPlacaDeBaza[i].getProducator().equals(producator)==true) 
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 7:{
                System.out.println("7. socket, pret");
                System.out.println("Introduceti socket-ul:");
                String socket=scanner.nextLine();
                System.out.println("Introduceti pretul maxim:");
                 double pret=scanner.nextDouble();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getSocket().equals(socket)==true && vectorPlacaDeBaza[i].getPret()<=pret) 
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 8:{
                System.out.println("8. chipset, tipMemorie");
                System.out.println("Introduceti chipset-ul:");
                String chipset=scanner.nextLine();
                System.out.println("Introduceti tipul memoriei:");
                String tipMemorie=scanner.nextLine();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getChipset().equals(chipset)==true && vectorPlacaDeBaza[i].getTipMemorie().equals(tipMemorie)==true) 
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 9:{
                System.out.println("9. chipset, capacitateMemorie");
                System.out.println("Introduceti chipset-ul:");
                String chipset=scanner.nextLine();
                //scanner.nextLine();
                System.out.println("Introduceti memoria minima:");
                int capacitateMemorie=scanner.nextInt();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getChipset().equals(chipset)==true && vectorPlacaDeBaza[i].getCapacitateMemorie()>=capacitateMemorie) 
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 10:{
                System.out.println("10. chipset, rataTransfer");
                System.out.println("Introduceti chipset-ul:");
                String chipset=scanner.nextLine();
                //scanner.nextLine();
                System.out.println("Introduceti rata de transfer:");
                int rataTransfer=scanner.nextInt();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getChipset().equals(chipset)==true && vectorPlacaDeBaza[i].getRataTransfer()>=rataTransfer) 
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 11:{
                System.out.println("11. chipset, porturiUSB");
                System.out.println("Introduceti chipset-ul:");
                String chipset=scanner.nextLine();
                //scanner.nextLine();
                System.out.println("Introduceti porturi USB:");
                int porturiUSB=scanner.nextInt();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getChipset().equals(chipset)==true && vectorPlacaDeBaza[i].getPorturiUSB()>=porturiUSB) 
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 12:{
                System.out.println("12. chipset, producator");
                System.out.println("Introduceti chipset-ul:");
                String chipset=scanner.nextLine();
                System.out.println("Introduceti producator:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getChipset().equals(chipset)==true && vectorPlacaDeBaza[i].getProducator().equals(producator)==true) 
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 13:{
                System.out.println("13. chipset, pret");
                System.out.println("Introduceti chipset-ul:");
                String chipset=scanner.nextLine();
                //scanner.nextLine();
                System.out.println("Introduceti pretul maxim:");
                double pret=scanner.nextDouble();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getChipset().equals(chipset)==true && vectorPlacaDeBaza[i].getPret()<=pret)
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 14:{
                System.out.println("14. tipMemorie, capacitateMemorie");
                System.out.println("Introduceti tipul memoriei:");
                String tipMemorie=scanner.nextLine();
                //scanner.nextLine();
                System.out.println("Introduceti capacitatea memoriei:");
                int capacitateMemorie=scanner.nextInt();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getTipMemorie().equals(tipMemorie)==true && vectorPlacaDeBaza[i].getCapacitateMemorie()>=capacitateMemorie)
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 15:{
                System.out.println("15. tipMemorie, rataTransfer");
                System.out.println("Introduceti tipul memoriei:");
                String tipMemorie=scanner.nextLine();
                //scanner.nextLine();
                System.out.println("Introduceti rata de tranfer:");
                int rataTransfer=scanner.nextInt();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getTipMemorie().equals(tipMemorie)==true && vectorPlacaDeBaza[i].getRataTransfer()>=rataTransfer)
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 16:{
                System.out.println("16. tipMemorie, porturiUSB");
                System.out.println("Introduceti tipul memoriei:");
                String tipMemorie=scanner.nextLine();
                //scanner.nextLine();
                System.out.println("Introduceti numerul de porturi USB:");
                int porturiUSB=scanner.nextInt();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getTipMemorie().equals(tipMemorie)==true && vectorPlacaDeBaza[i].getPorturiUSB()>=porturiUSB)
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 17:{
                System.out.println("17. tipMemorie, producator");
                System.out.println("Introduceti tipul memoriei:");
                String tipMemorie=scanner.nextLine();
                //scanner.nextLine();
                System.out.println("Introduceti producatorul:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getTipMemorie().equals(tipMemorie)==true && vectorPlacaDeBaza[i].getProducator().equals(producator)==true)
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 18:{
                System.out.println("18. tipMemorie, pret");
                System.out.println("Introduceti tipul memoriei:");
                String tipMemorie=scanner.nextLine();
                //scanner.nextLine();
                System.out.println("Introduceti pretul maxim:");
                Double pret=scanner.nextDouble();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getTipMemorie().equals(tipMemorie)==true && vectorPlacaDeBaza[i].getPret()<=pret)
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 19:{
                System.out.println("19. capacitateMemorie, rataTransfer");
                System.out.println("Introduceti memoria minima:");
                int capacitateMemorie=scanner.nextInt();
                //scanner.nextLine();
                System.out.println("Introduceti rata de transfer:");
                int rataTransfer=scanner.nextInt();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getCapacitateMemorie()>=capacitateMemorie && vectorPlacaDeBaza[i].getRataTransfer()>=rataTransfer)
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 20:{
                System.out.println("20. capacitateMemorie, porturiUSB");
                System.out.println("Introduceti memoria minima:");
                int capacitateMemorie=scanner.nextInt();
                System.out.println("Introduceti porturi USB:");
                int porturiUSB=scanner.nextInt();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getCapacitateMemorie()>=capacitateMemorie && vectorPlacaDeBaza[i].getPorturiUSB()>=porturiUSB)
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 21:{
                System.out.println("21. capacitateMemorie, producator");
                System.out.println("Introduceti capacitate memorie:");
                int capacitateMemorie=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduceti producatorul:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getCapacitateMemorie()>=capacitateMemorie && vectorPlacaDeBaza[i].getProducator().equals(producator)==true)
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 22:{
                System.out.println("22. capacitateMemorie, pret");
                System.out.println("Introduceti capacitate memorie:");
                int capacitateMemorie=scanner.nextInt();
                //scanner.nextLine();
                System.out.println("Introduceti pretul maxim:");
                Double pret=scanner.nextDouble();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getCapacitateMemorie()>=capacitateMemorie && vectorPlacaDeBaza[i].getPret()<=pret)
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 23:{
                System.out.println("23. rataTransfer, porturiUSB");
                System.out.println("Introduceti rata de tranfer:");
                int rataTransfer=scanner.nextInt();
                //scanner.nextLine();
                System.out.println("Introduceti porturi USB:");
                int porturiUSB=scanner.nextInt();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getRataTransfer()>=rataTransfer && vectorPlacaDeBaza[i].getPorturiUSB()>=porturiUSB)
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 24:{
                System.out.println("24. rataTransfer, producator");
                System.out.println("Introduceti rata de transfer:");
                int rataTransfer=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduceti producatorul:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getRataTransfer()>=rataTransfer && vectorPlacaDeBaza[i].getProducator().equals(producator)==true)
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 25:{
                System.out.println("25. rataTransfer, pret");
                System.out.println("Introduceti rata de transfer:");
                int rataTransfer=scanner.nextInt();
                //scanner.nextLine();
                System.out.println("Introduceti pretul:");
                Double pret=scanner.nextDouble();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getRataTransfer()>=rataTransfer && vectorPlacaDeBaza[i].getPret()<=pret)
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 26:{
                System.out.println("26. porturiUSB, producator");
                System.out.println("Introduceti porturi USB:");
                int porturiUSB=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduceti producatorul:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getPorturiUSB()>=porturiUSB && vectorPlacaDeBaza[i].getProducator().equals(producator))
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 27:{
                System.out.println("27. porturiUSB, pret");
                System.out.println("Introduceti porturi USB:");
                int porturiUSB=scanner.nextInt();
                //scanner.nextLine();
                System.out.println("Introduceti pretul maxim:");
                Double pret=scanner.nextDouble();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getPorturiUSB()>=porturiUSB && vectorPlacaDeBaza[i].getPret()<=pret)
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            case 28:{
                System.out.println("28. producator, pret"); 
                System.out.println("Introduceti producatorul:");
                String producator=scanner.nextLine();
                //scanner.nextLine();
                System.out.println("Introduceti pretul maxim:");
                Double pret=scanner.nextDouble();
                for(int i=0;i<vectorPlacaDeBaza.length;i++)
                {if(vectorPlacaDeBaza[i].getProducator().equals(producator)==true && vectorPlacaDeBaza[i].getPret()<=pret)
                System.out.println(vectorPlacaDeBaza[i]);}
                break;}
            default:
                System.out.println("Optiune invalida");
                break;
        }  
        
        }
               
        //Memorie RAM
         {
        System.out.println("\nVector MemorieRAM:");
        MemorieRAM memorie3 = new MemorieRAM("Corsair", "DDR3", 8, 1600, 1.35, "CL16",99.99);
        MemorieRAM memorie4 = new MemorieRAM("Kingston", "DDR3", 8, 1200, 1.20,"CL15",69.99);
        MemorieRAM memorie5 = new MemorieRAM("ADATA", "DDR4", 8, 2666, 1.20,"CL16",79.99);
        MemorieRAM memorie6 = new MemorieRAM("Corsair", "DDR4", 16, 3200, 1.35,"CL16",109.99);
        MemorieRAM memorie7 = new MemorieRAM("Kingston", "DDR4", 16, 2400, 1.20,"CL15",89.99);
        MemorieRAM memorie8 = new MemorieRAM("ADATA", "DDR4", 16, 3600, 1.20, "CL19",99.99);
        MemorieRAM memorie9 = new MemorieRAM("Corsair", "DDR4", 32, 3200, 1.35,"CL18",199.99);
        MemorieRAM memorie10 = new MemorieRAM("Kingston", "DDR4", 32, 2400, 1.20,"CL16",149.99);
        MemorieRAM memorie11 = new MemorieRAM("ADATA", "DDR4", 32, 3000, 1.20, "CL15",129.99);
        MemorieRAM memorie12 = new MemorieRAM("Corsair", "DDR4", 64, 3200, 1.35, "CL16",399.99);
        MemorieRAM[] vectorMemorieRAM = {memorie3, memorie4, memorie5, memorie6, memorie7, memorie8, memorie9, memorie10, memorie11, memorie12};
       for(int i=0;i<vectorMemorieRAM.length;i++)
       { 
        System.out.println(vectorMemorieRAM[i]);
      }
        
        System.out.println("1. TipMemorie, capacitate");
        System.out.println("2. TipMemorie, frecventa");
        System.out.println("3. TipMemorie, voltaj");
        System.out.println("4. TipMemorie, latenta");
        System.out.println("5. TipMemorie, pret");
        System.out.println("6. TipMemorie, producator");
        System.out.println("7. Capacitate, frecventa");
        System.out.println("8. Capacitate, voltaj");
        System.out.println("9. Capacitate, latenta");
        System.out.println("10. Capacitate, pret");
        System.out.println("11. Capacitate, producator");
        System.out.println("12. Frecventa, voltaj");
        System.out.println("13. Frecventa, latenta");
        System.out.println("14. Frecventa, pret");
        System.out.println("15. Frecventa, producator");
        System.out.println("16. Voltaj, latenta");
        System.out.println("17. Voltaj, pret");
        System.out.println("18. Voltaj, producator");
        System.out.println("19. Latenta, pret");
        System.out.println("20. Latenta, producator");
        System.out.println("21. Pret, producator");
        
        System.out.println("Alege o optiune:");
        int optiuneMemorieRAM = scanner.nextInt();
        scanner.nextLine();
        
        switch (optiuneMemorieRAM) {
            case 1:{
                System.out.println("TipMemorie, capacitate");
                System.out.println("Introdu tipul de memorie:");
                String tipMemorie=scanner.nextLine();
                System.out.println("Introdu capacitatea minima:");
                int capacitateMinima=scanner.nextInt();
                for(int i=0;i<vectorMemorieRAM.length;i++)
                {if(vectorMemorieRAM[i].getTipMemorie().equals(tipMemorie)==true && vectorMemorieRAM[i].getCapacitate()>=capacitateMinima) 
                System.out.println(vectorMemorieRAM[i]);
                }
                break;}
            case 2:{
                System.out.println("TipMemorie, frecventa");
                System.out.println("Introdu tipul de memorie:");
                String tipMemorie=scanner.nextLine();
                System.out.println("Introdu frecventa minima:");
                int frecventa=scanner.nextInt();
                for(int i=0;i<vectorMemorieRAM.length;i++)
                {if(vectorMemorieRAM[i].getTipMemorie().equals(tipMemorie)==true && vectorMemorieRAM[i].getFrecventa()>=frecventa) 
                System.out.println(vectorMemorieRAM[i]);
                }
                break;}
            case 3:{
                System.out.println("TipMemorie, voltaj");      
                System.out.println("Introdu tipul de memorie:");
                String tipMemorie=scanner.nextLine();
                System.out.println("Introdu voltaj:");
                double voltaj=scanner.nextDouble();
                for(int i=0;i<vectorMemorieRAM.length;i++)
                {if(vectorMemorieRAM[i].getTipMemorie().equals(tipMemorie)==true && vectorMemorieRAM[i].getVoltaj()==voltaj) 
                System.out.println(vectorMemorieRAM[i]);}
                break;
                }
            case 4:{
                System.out.println("TipMemorie, latenta");
                System.out.println("Introdu tipul de memorie:");
                String tipMemorie=scanner.nextLine();
                System.out.println("Introdu latenta:");
                String latenta=scanner.nextLine();
                for(int i=0;i<vectorMemorieRAM.length;i++)
                {if(vectorMemorieRAM[i].getTipMemorie().equals(tipMemorie)==true && vectorMemorieRAM[i].getLatenta().equals(latenta)==true) 
                System.out.println(vectorMemorieRAM[i]);}
                break;}
            case 5:{
                System.out.println("TipMemorie, pret");
                System.out.println("Introdu tipul de memorie:");
                String tipMemorie=scanner.nextLine();
                System.out.println("Introdu pret maxim:");
                double pret=scanner.nextDouble();
                for(int i=0;i<vectorMemorieRAM.length;i++)
                {if(vectorMemorieRAM[i].getTipMemorie().equals(tipMemorie)==true && vectorMemorieRAM[i].getPret()<=pret) 
                System.out.println(vectorMemorieRAM[i]);}
                break;}
            case 6:{
                System.out.println("TipMemorie, producator");
                System.out.println("Introduceti tipul de memorie:");
                String tipMemorie=scanner.nextLine();
                System.out.println("Introduceti producator:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorMemorieRAM.length;i++)
                {if(vectorMemorieRAM[i].getTipMemorie().equals(tipMemorie)==true && vectorMemorieRAM[i].getProducator().equals(producator)==true) 
                System.out.println(vectorMemorieRAM[i]);}
                break;}
            case 7:{
                System.out.println("Capacitate, frecventa");
                System.out.println("Introduceti capacitatea minima:");
                int capacitateMinima=scanner.nextInt();
                System.out.println("Introduceti frecventa minima:");
                 int frecventaMinima=scanner.nextInt();
                for(int i=0;i<vectorMemorieRAM.length;i++)
                {if(vectorMemorieRAM[i].getCapacitate()>=capacitateMinima && vectorMemorieRAM[i].getFrecventa()>=frecventaMinima) 
                System.out.println(vectorMemorieRAM[i]);}
                break;}
            case 8:{
                System.out.println("Capacitate, voltaj");
                System.out.println("Introduceti capacitatea minima:");
                int capacitateMinima=scanner.nextInt();
                System.out.println("Introduceti voltaj:");
                double voltaj=scanner.nextDouble();
                for(int i=0;i<vectorMemorieRAM.length;i++)
                {if(vectorMemorieRAM[i].getCapacitate()>=capacitateMinima && vectorMemorieRAM[i].getVoltaj()==voltaj) 
                System.out.println(vectorMemorieRAM[i]);}
                break;}
            case 9:{
                System.out.println("Capacitate, latenta");
                System.out.println("Introduceti capacitatea minima:");
                int capacitateMinima=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduceti latenta:");
                String latenta=scanner.nextLine();
                for(int i=0;i<vectorMemorieRAM.length;i++)
                {if(vectorMemorieRAM[i].getCapacitate()>=capacitateMinima && vectorMemorieRAM[i].getLatenta().equals(latenta)==true) 
                System.out.println(vectorMemorieRAM[i]);}
                break;}
            case 10:{
                System.out.println("Capacitate, pret");
                System.out.println("Introduceti capacitatea minima:");
                int capacitateMinima=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduceti pretul maxim:");
                double pret=scanner.nextDouble();
                for(int i=0;i<vectorMemorieRAM.length;i++)
                {if(vectorMemorieRAM[i].getCapacitate()>=capacitateMinima && vectorMemorieRAM[i].getPret()<=pret) 
                System.out.println(vectorMemorieRAM[i]);}
                break;}
            case 11:{
                System.out.println("Capacitate, producator");
                System.out.println("Introduceti capacitatea minima:");
                int capacitateMinima=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduceti producator:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorMemorieRAM.length;i++)
                {if(vectorMemorieRAM[i].getCapacitate()>=capacitateMinima && vectorMemorieRAM[i].getProducator().equals(producator)==true) 
                System.out.println(vectorMemorieRAM[i]);}
                break;}
            case 12:{
                System.out.println("Frecventa, voltaj");
                System.out.println("Introduceti frecventa minima:");
                int frecventaMinima=scanner.nextInt();
                System.out.println("Introduceti voltajul:");
                double voltaj=scanner.nextDouble();
                for(int i=0;i<vectorMemorieRAM.length;i++)
                {if(vectorMemorieRAM[i].getFrecventa()>=frecventaMinima && vectorMemorieRAM[i].getVoltaj()==voltaj) 
                System.out.println(vectorMemorieRAM[i]);}
                break;}
            case 13:{
                System.out.println("Frecventa, latenta");
                System.out.println("Introduceti frecventa minima:");
                int frecventaMinima=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduceti latenta:");
                String latenta=scanner.nextLine();
                for(int i=0;i<vectorMemorieRAM.length;i++)
                {if(vectorMemorieRAM[i].getFrecventa()>=frecventaMinima && vectorMemorieRAM[i].getLatenta().equals(latenta)==true)
                System.out.println(vectorMemorieRAM[i]);}
                break;}
            case 14:{
                System.out.println("Frecventa, pret");
                System.out.println("Introduceti frecventa minima:");
                int frecventaMinima=scanner.nextInt();
                System.out.println("Introduceti pretul maxim:");
                double pret=scanner.nextDouble();
                for(int i=0;i<vectorMemorieRAM.length;i++)
                {if(vectorMemorieRAM[i].getFrecventa()>=frecventaMinima && vectorMemorieRAM[i].getPret()<=pret)
                System.out.println(vectorMemorieRAM[i]);}
                break;}
            case 15:{
                System.out.println("Frecventa, producator");
                System.out.println("Introduceti frecventa minima:");
                int frecventaMinima=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduceti producator:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorMemorieRAM.length;i++)
                {if(vectorMemorieRAM[i].getFrecventa()>=frecventaMinima && vectorMemorieRAM[i].getProducator().equals(producator)==true)
                System.out.println(vectorMemorieRAM[i]);}
                break;}
            case 16:{
                System.out.println("Voltaj, latenta");
                System.out.println("Introduceti voltajul:");
                double voltaj=scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Introduceti latenta:");
                String latenta=scanner.nextLine();
                for(int i=0;i<vectorMemorieRAM.length;i++)
                {if(vectorMemorieRAM[i].getVoltaj()==voltaj && vectorMemorieRAM[i].getLatenta().equals(latenta)==true)
                System.out.println(vectorMemorieRAM[i]);}
                break;}
            case 17:{
                System.out.println("Voltaj, pret");
                System.out.println("Introduceti voltajul:");
                double voltaj=scanner.nextDouble();
                System.out.println("Introduceti pretul maxim:");
                double pret=scanner.nextDouble();
                for(int i=0;i<vectorMemorieRAM.length;i++)
                {if(vectorMemorieRAM[i].getVoltaj()==voltaj && vectorMemorieRAM[i].getPret()<=pret)
                System.out.println(vectorMemorieRAM[i]);}
                break;}
            case 18:{
                System.out.println("Voltaj, producator");
                System.out.println("Introduceti voltajul:");
                double voltaj=scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Introduceti producatorul:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorMemorieRAM.length;i++)
                {if(vectorMemorieRAM[i].getVoltaj()==voltaj && vectorMemorieRAM[i].getProducator().equals(producator)==true)
                System.out.println(vectorMemorieRAM[i]);}
                break;}
            case 19:{
                System.out.println("Latenta, pret");
                System.out.println("Introduceti latenta:");
                String latenta=scanner.nextLine();
                System.out.println("Introduceti pretul maxim:");
                double pret=scanner.nextDouble();
                for(int i=0;i<vectorMemorieRAM.length;i++)
                {if(vectorMemorieRAM[i].getLatenta().equals(latenta)==true && vectorMemorieRAM[i].getPret()<=pret)
                System.out.println(vectorMemorieRAM[i]);}
                break;}
            case 20:{
                System.out.println("Latenta, producator");
                System.out.println("Introduceti latenta:");
                String latenta=scanner.nextLine();
                System.out.println("Introduceti producator:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorMemorieRAM.length;i++)
                {if(vectorMemorieRAM[i].getLatenta().equals(latenta)==true && vectorMemorieRAM[i].getProducator().equals(producator)==true)
                System.out.println(vectorMemorieRAM[i]);}
                break;}
            case 21:{
                System.out.println("Pret, producator");
                System.out.println("Introduceti pretul maxim:");
                double pret=scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Introduceti producatorul:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorMemorieRAM.length;i++)
                {if(vectorMemorieRAM[i].getPret()<=pret && vectorMemorieRAM[i].getProducator().equals(producator)==true)
                System.out.println(vectorMemorieRAM[i]);}
                break;}
            default:
                System.out.println("Optiune invalida");
                break;
        }       
        }
          
         //Hard Disk
        {          
        System.out.println("\nVector HardDisk:");
        HardDisk hard3 = new HardDisk("Seagate", 1000, 5400, 32, "SATA", 2.5, 150.0);
        HardDisk hard4 = new HardDisk("Kingston", 500, 7200, 128, "SATA", 2.5, 120.0);
        HardDisk hard5 = new HardDisk("Samsung", 1500, 5400, 256, "SATA", 3.5, 200.0);
        HardDisk hard6 = new HardDisk("Western Digital", 2000, 7200, 64, "SATA", 3.5, 180.0);
        HardDisk hard7 = new HardDisk("Seagate", 500, 5400, 32, "SATA", 2.5, 130.0);
        HardDisk hard8 = new HardDisk("Kingston", 3000, 7200, 128, "SATA", 3.5, 250.0);
        HardDisk hard9 = new HardDisk("Samsung", 1000, 5400, 64, "SATA", 2.5, 160.0);
        HardDisk hard10 = new HardDisk("Western Digital", 2000, 7200, 256, "SATA3", 3.5, 230.0);
        HardDisk hard11 = new HardDisk("Seagate", 500, 5400, 32, "SATA", 2.5, 140.0);
        HardDisk hard12 = new HardDisk("Samsung", 1000, 7200, 128, "SATA", 3.5, 200.0);
        HardDisk[] vectorHardDisk = { hard3, hard4, hard5, hard6, hard7, hard8, hard9, hard10, hard11, hard12 };
           for(int i=0;i<vectorHardDisk.length;i++)
       { 
           System.out.println(vectorHardDisk[i]);
       }
        System.out.println("1. Capacitate, viteza");
        System.out.println("2. Capacitate, buffer");
        System.out.println("3. Capacitate, interfata");
        System.out.println("4. Capacitate, format");
        System.out.println("5. Capacitate, pret");
        System.out.println("6. Capacitate, producator");
        System.out.println("7. Viteza, buffer");
        System.out.println("8. Viteza, interfata");
        System.out.println("9. Viteza, format");
        System.out.println("10. Viteza, pret");
        System.out.println("11. Viteza, producator");
        System.out.println("12. Buffer, interfata");
        System.out.println("13. Buffer, format");
        System.out.println("14. Buffer, pret");
        System.out.println("15. Buffer, producator");
        System.out.println("16. Interfata, format");
        System.out.println("17. Interfata, pret");
        System.out.println("18. Interfata, producator");
        System.out.println("19. Format, pret");
        System.out.println("20. Format, producator");
        System.out.println("21. Pret, producator");

           System.out.println("Alege o optiune:");
           int  optiuneHardDisk = scanner.nextInt();
           switch (optiuneHardDisk) {
            case 1:
            {System.out.println("Capacitate, viteza");
             System.out.println("Introduceti capacitatea minima:");
             int capacitateMinima=scanner.nextInt();
             System.out.println("Introduceti viteza minima:");
             int vitezaMinima=scanner.nextInt();
             for(int i=0;i<vectorHardDisk.length;i++)
       {     if(vectorHardDisk[i].getCapacitate()>=capacitateMinima && vectorHardDisk[i].getViteza()>=vitezaMinima){
           System.out.println(vectorHardDisk[i]);}
       }
                break;}
            case 2:{
             System.out.println("Capacitate, buffer");
             System.out.println("Introduceti capacitatea minima:");
             int capacitateMinima=scanner.nextInt();
             System.out.println("Introduceti buffer minim:");
             int bufferMinim=scanner.nextInt();
             for(int i=0;i<vectorHardDisk.length;i++)
       {     if(vectorHardDisk[i].getCapacitate()>=capacitateMinima && vectorHardDisk[i].getBuffer()>=bufferMinim){
                System.out.println(vectorHardDisk[i]);}
       }
                break;}
            case 3:{
             System.out.println("Capacitate, interfata");
             System.out.println("Introduceti capacitatea minima:");
             int capacitateMinima=scanner.nextInt();
             scanner.nextLine();
             System.out.println("Introduceti interfata:");
             String interfata=scanner.nextLine();
             for(int i=0;i<vectorHardDisk.length;i++)
       {     if(vectorHardDisk[i].getCapacitate()>=capacitateMinima && vectorHardDisk[i].getInterfata().equals(interfata)==true){
                System.out.println(vectorHardDisk[i]);}
       }
                break;}
            case 4:{
             System.out.println("Capacitate, format");         
             System.out.println("Introduceti capacitatea minima:");
             int capacitateMinima=scanner.nextInt();
             scanner.nextLine();
             System.out.println("Introduceti Format:");
             Double format=scanner.nextDouble();
             for(int i=0;i<vectorHardDisk.length;i++)
       {     if(vectorHardDisk[i].getCapacitate()>=capacitateMinima && vectorHardDisk[i].getFormat()==format){
                System.out.println(vectorHardDisk[i]);}
       }
                
                break;
            }
            case 5:{
             System.out.println("Capacitate, pret");
             System.out.println("Introduceti capacitatea minima:");
             int capacitateMinima=scanner.nextInt();
             scanner.nextLine();
             System.out.println("Introduceti pretul maxim:");
             Double pret=scanner.nextDouble();
             for(int i=0;i<vectorHardDisk.length;i++)
       {     if(vectorHardDisk[i].getCapacitate()>=capacitateMinima && vectorHardDisk[i].getPret()<=pret)
                System.out.println(vectorHardDisk[i]);
       }
                break;}
            case 6:{
             System.out.println("Capacitate, producator");
             System.out.println("Introduceti capacitatea minima:");
             int capacitateMinima=scanner.nextInt();
             scanner.nextLine();
             System.out.println("Introduceti producatorul:");
             String producator=scanner.nextLine();
             for(int i=0;i<vectorHardDisk.length;i++)
       {     if(vectorHardDisk[i].getCapacitate()>=capacitateMinima && vectorHardDisk[i].getProducator().equals(producator)==true)
                System.out.println(vectorHardDisk[i]);
       }
                
                break;}

            case 7:{
             System.out.println("Viteza, buffer");
             System.out.println("Introduceti viteza minima:");
             int vitezaMinima=scanner.nextInt();
             scanner.nextLine();
             System.out.println("Introduceti buffer minim:");
             int bufferMinim=scanner.nextInt(); 
             for(int i=0;i<vectorHardDisk.length;i++)
       {     if(vectorHardDisk[i].getViteza()>=vitezaMinima && vectorHardDisk[i].getBuffer()>=bufferMinim)
                System.out.println(vectorHardDisk[i]);
       }
                break;}
            case 8:{
             System.out.println("Viteza, interfata");
             System.out.println("Introduceti viteza minima:");
             int vitezaMinima=scanner.nextInt();
             scanner.nextLine();
             System.out.println("Introduceti interfata:");
             String interfata=scanner.nextLine();
             for(int i=0;i<vectorHardDisk.length;i++)
       {     if(vectorHardDisk[i].getViteza()>=vitezaMinima && vectorHardDisk[i].getInterfata().equals(interfata)==true)
                System.out.println(vectorHardDisk[i]);
       }
                break;}
            case 9:{    
             System.out.println("Viteza, format");
             System.out.println("Introduceti viteza minima:");
             int vitezaMinima=scanner.nextInt();
             scanner.nextLine();
             System.out.println("Introduceti Format:");
             double format=scanner.nextDouble();
             for(int i=0;i<vectorHardDisk.length;i++)
       {     if(vectorHardDisk[i].getViteza()>=vitezaMinima && vectorHardDisk[i].getFormat()==format)
                System.out.println(vectorHardDisk[i]);
       }
                break;}
            case 10:{
             System.out.println("Viteza, pret");
             System.out.println("Introduceti viteza minima:");
             int vitezaMinima=scanner.nextInt();
             scanner.nextLine();
             System.out.println("Introduceti pretul maxim:");
             double pret=scanner.nextDouble();
             for(int i=0;i<vectorHardDisk.length;i++)
       {     if(vectorHardDisk[i].getViteza()>=vitezaMinima && vectorHardDisk[i].getPret()<=pret)
                System.out.println(vectorHardDisk[i]);
       }
                break;}
            case 11:{
             System.out.println("Viteza, producator");
             System.out.println("Introduceti viteza minima:");
             int vitezaMinima=scanner.nextInt();
             scanner.nextLine();
             System.out.println("Introduceti producator:");
             String producator=scanner.nextLine();
             for(int i=0;i<vectorHardDisk.length;i++)
       {     if(vectorHardDisk[i].getViteza()>=vitezaMinima && vectorHardDisk[i].getProducator().equals(producator)==true)
                System.out.println(vectorHardDisk[i]);
       }
                break;}

            case 12:{
             System.out.println("Buffer, interfata");
             System.out.println("Introduceti buffer minim:");
             int bufferMinim=scanner.nextInt();
             scanner.nextLine();
             System.out.println("Introduceti interfata:");
             String interfata=scanner.nextLine();
             for(int i=0;i<vectorHardDisk.length;i++)
       {     if(vectorHardDisk[i].getBuffer()>=bufferMinim && vectorHardDisk[i].getInterfata().equals(interfata)==true)
                System.out.println(vectorHardDisk[i]);
       }
                break;}
            case 13:{   
             System.out.println("Buffer, format");
             System.out.println("Introduceti buffer minim:");
             int bufferMinim=scanner.nextInt();
             scanner.nextLine();
             System.out.println("Introduceti format:");
             double format=scanner.nextDouble();
             for(int i=0;i<vectorHardDisk.length;i++)
       {     if(vectorHardDisk[i].getBuffer()>=bufferMinim && vectorHardDisk[i].getFormat()==format)
                System.out.println(vectorHardDisk[i]);
       }
                break;}
            case 14:{
             System.out.println("Buffer, pret");
             System.out.println("Introduceti buffer minim:");
             int bufferMinim=scanner.nextInt();
             scanner.nextLine();
             System.out.println("Introduceti pret maxim:");
             double pret=scanner.nextDouble();
             for(int i=0;i<vectorHardDisk.length;i++)
       {     if(vectorHardDisk[i].getBuffer()>=bufferMinim && vectorHardDisk[i].getPret()<=pret)
                System.out.println(vectorHardDisk[i]);
       }
                break;}
            case 15:{
                System.out.println("Buffer, producator");
                System.out.println("Introduceti buffer minim:");
             int bufferMinim=scanner.nextInt();
             scanner.nextLine();
             System.out.println("Introduceti producator:");
             String producator=scanner.nextLine();
             for(int i=0;i<vectorHardDisk.length;i++)
       {     if(vectorHardDisk[i].getBuffer()>=bufferMinim && vectorHardDisk[i].getProducator().equals(producator)==true)
                System.out.println(vectorHardDisk[i]);
       }
                break;}

            case 16:{
                System.out.println("Interfata, format");
                System.out.println("Introduceti interfata:");
                scanner.nextLine();
                String interfata=scanner.nextLine();
                System.out.println("Introduceti formatul:");
                double format=scanner.nextDouble();
                for(int i=0;i<vectorHardDisk.length;i++)
       {        if(vectorHardDisk[i].getInterfata().equals(interfata)==true && vectorHardDisk[i].getFormat()==format)
                    System.out.println(vectorHardDisk[i]);
       }
                  break;}
            case 17:{
                System.out.println("Interfata, pret");
                System.out.println("Introduceti interfata:");
                scanner.nextLine();
                String interfata=scanner.nextLine();
                System.out.println("Introduceti pretul maxim:");
                double pret=scanner.nextDouble();
                for(int i=0;i<vectorHardDisk.length;i++)
       {        if(vectorHardDisk[i].getInterfata().equals(interfata)==true && vectorHardDisk[i].getPret()<=pret)
                    System.out.println(vectorHardDisk[i]);
       }    
                break;}
            case 18:{
                System.out.println("Interfata, producator");
                System.out.println("Introduceti interfata:");
                scanner.nextLine();
                String interfata=scanner.nextLine(); 
                System.out.println("Introduceti producatorul:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorHardDisk.length;i++)
       {        if(vectorHardDisk[i].getInterfata().equals(interfata)==true && vectorHardDisk[i].getProducator().equals(producator)==true)
                    System.out.println(vectorHardDisk[i]);
       }
                break;
            }
            case 19:{
                System.out.println("Format, pret");
                System.out.println("Introduceti format:");
                double format=scanner.nextDouble();
                System.out.println("Introduceti pretul maxim:");
                double pret=scanner.nextDouble();
                for(int i=0;i<vectorHardDisk.length;i++)
       {        if(vectorHardDisk[i].getFormat()==format && vectorHardDisk[i].getPret()<=pret)
                    System.out.println(vectorHardDisk[i]);
       }
                break;}
            case 20:{
                System.out.println("Format, producator");
                System.out.println("Introduceti format:");
                double format=scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Introduceti producator:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorHardDisk.length;i++)
       {        if(vectorHardDisk[i].getFormat()==format && vectorHardDisk[i].getProducator().equals(producator)==true)
                    System.out.println(vectorHardDisk[i]);
       }
                break;}

            case 21:{
                System.out.println("Pret, producator");
                System.out.println("Introduceti pretul maxim:");
                double pret=scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Introduceti producator:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorHardDisk.length;i++)
       {        if(vectorHardDisk[i].getPret()<=pret && vectorHardDisk[i].getProducator().equals(producator)==true)
                    System.out.println(vectorHardDisk[i]);
       }
                break;
            }
            default:
                System.out.println("Optiune invalida");
                break;
        }
        }
                  
        //Placa Video
        {
             
        System.out.println("\nVector PlacaVideo:");
        PlacaVideo placaVideo4 = new PlacaVideo("NVIDIA", "RTX 3080",12, "PCI Express 4.0", "7680x4320", 1500.0);
        PlacaVideo placaVideo5 = new PlacaVideo("AMD", "RX 6800 XT",16, "PCI Express 4.0", "7680x4320", 1700.0);
        PlacaVideo placaVideo6 = new PlacaVideo("NVIDIA", "GTX 1660 Super",6, "PCI Express 3.0", "1920x1080", 300.0);
        PlacaVideo placaVideo7 = new PlacaVideo("AMD", "RX 5700 XT",8, "PCI Express 4.0", "2560x1440", 1200.0);
        PlacaVideo placaVideo8 = new PlacaVideo("NVIDIA", "GTX 1650",4, "PCI Express 3.0", "2560x1600", 200.0);
        PlacaVideo placaVideo9 = new PlacaVideo("AMD", "RX 5500 XT",8, "PCI Express 4.0", "1920x1080", 250.0);
        PlacaVideo placaVideo10 = new PlacaVideo("NVIDIA", "RTX 3060",12, "PCI Express 4.0", "7680x4320", 400.0);
        PlacaVideo placaVideo11 = new PlacaVideo("AMD", "RX 6700 XT",12, "PCI Express 4.0", "2560x1440", 1500.0);
        PlacaVideo placaVideo12 = new PlacaVideo("NVIDIA", "GTX 1050 Ti",4, "PCI Express 3.0", "1920x1080", 150.0);
        PlacaVideo placaVideo13 = new PlacaVideo("NVIDIA", "GTX 1660",6, "PCI Express 3.0", "1920x1080", 250.0);
        PlacaVideo[] vectorPlacaVideo = {placaVideo4, placaVideo5, placaVideo6, placaVideo7, placaVideo8 ,placaVideo9, placaVideo10, placaVideo11, placaVideo12, placaVideo13};
        for (int i = 0; i < vectorPlacaVideo.length; i++) {
            System.out.println(vectorPlacaVideo[i]);
        }
        
         
        System.out.println("1. Serie Procesor, vRAM");
        System.out.println("2. Serie Procesor, Slot");
        System.out.println("3. Serie Procesor, Rezolutie Maxima");
        System.out.println("4. Serie Procesor, pret");
        System.out.println("5. Serie Procesor, producator");
        System.out.println("6. vRAM, Slot");
        System.out.println("7. vRAM, Rezolutie Maxima");
        System.out.println("8. vRAM, pret");
        System.out.println("9. vRAM, producator");
        System.out.println("10. Slot, Rezolutie Maxima");
        System.out.println("11. Slot, pret");
        System.out.println("12. Slot, producator");      
        System.out.println("13. Rezolutie Maxima, pret");
        System.out.println("14. Rezolutie Maxima, producator");      
        System.out.println("15. pret, producator");
        
        System.out.println("Alege o optiune:");
        int optiunePlacaVideo = scanner.nextInt();
        scanner.nextLine();
        
        switch (optiunePlacaVideo) {
            case 1:{
                System.out.println("Serie Procesor, vRAM");
                System.out.println("Introduceti seria procesorului:");
                String serieProcesor=scanner.nextLine();
                System.out.println("Introduceti valoarea minima a vRAM-ului:");
                int vRAM=scanner.nextInt();
                for(int i=0;i<vectorPlacaVideo.length;i++)
                {if(vectorPlacaVideo[i].getSerieProcesor().equals(serieProcesor)==true && vectorPlacaVideo[i].getVram()>=vRAM) 
                System.out.println(vectorPlacaVideo[i]);
                }
                break;}
         
            case 2:{
                System.out.println("Serie Procesor, Slot");
                System.out.println("Introduceti seria procesorului:");
                String serieProcesor=scanner.nextLine();
                System.out.println("Introduceti denumirea slot-ului:");
                String slot=scanner.nextLine();
                for(int i=0;i<vectorPlacaVideo.length;i++)
                {if(vectorPlacaVideo[i].getSerieProcesor().equals(serieProcesor)==true && vectorPlacaVideo[i].getSlot().equals(slot)==true) 
                System.out.println(vectorPlacaVideo[i]);}
                break;}
        
            case 3:{
                System.out.println("Serie Procesor, Rezolutie Maxima");      
                System.out.println("Introduceti seria procesorului:");
                String serieProcesor=scanner.nextLine();
                System.out.println("Introduceti rezolutia maxima:");
                String rezolutie=scanner.nextLine();
                for(int i=0;i<vectorPlacaVideo.length;i++)
                {if(vectorPlacaVideo[i].getSerieProcesor().equals(serieProcesor)==true && vectorPlacaVideo[i].getRezolutieMaxima().equals(rezolutie)==true) 
                System.out.println(vectorPlacaVideo[i]);}
                break;}
            
            case 4:{
                System.out.println("Serie Procesor, pret");
                System.out.println("Introduceti seria procesorului:");
                String serieProcesor=scanner.nextLine();
                System.out.println("Introdu pretul minim:");
                double pret=scanner.nextDouble();
                for(int i=0;i<vectorPlacaVideo.length;i++)
                {if(vectorPlacaVideo[i].getSerieProcesor().equals(serieProcesor)==true && vectorPlacaVideo[i].getPret()>=pret) 
                System.out.println(vectorPlacaVideo[i]);}
                break;}
            
            case 5:{
                System.out.println("Serie Procesor, producator");
                System.out.println("Introduceti seria procesorului:");
                String serieProcesor=scanner.nextLine();
                System.out.println("Introduceti denumirea producatorului:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorPlacaVideo.length;i++)
                {if(vectorPlacaVideo[i].getSerieProcesor().equals(serieProcesor)==true && vectorPlacaVideo[i].getProducator().equals(producator)==true) 
                System.out.println(vectorPlacaVideo[i]);}
                break;}
            
            case 6:{
                System.out.println("vRAM, Slot");
                System.out.println("Introduceti valoarea minima a vRAM-ului:");
                int vRAM=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduceti denumirea slot-ului:");
                String slot=scanner.nextLine();
                for(int i=0;i<vectorPlacaVideo.length;i++)
                {if(vectorPlacaVideo[i].getVram()>=vRAM && vectorPlacaVideo[i].getSlot().equals(slot)==true) 
                System.out.println(vectorPlacaVideo[i]);}
                break;}
            
            case 7:{
                System.out.println("vRAM, Rezolutie Maxima");
                System.out.println("Introduceti valoarea minima a vRAM-ului:");
                int vRAM=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduceti rezolutia maxima:");
                String rezolutieMaxima=scanner.nextLine();
                for(int i=0;i<vectorPlacaVideo.length;i++)
                {if(vectorPlacaVideo[i].getVram()>=vRAM && vectorPlacaVideo[i].getRezolutieMaxima().equals(rezolutieMaxima)==true) 
                System.out.println(vectorPlacaVideo[i]);}
                break;}
            
            case 8:{
                System.out.println("vRAM, pret");
                System.out.println("Introduceti valoarea vRAM-ului:");
                int vRAM=scanner.nextInt();
                System.out.println("Introduceti pretul minim:");
                double pret=scanner.nextDouble();
                for(int i=0;i<vectorPlacaVideo.length;i++)
                {if(vectorPlacaVideo[i].getVram()>=vRAM && vectorPlacaVideo[i].getPret()>=pret) 
                System.out.println(vectorPlacaVideo[i]);}
                break;}
            
            case 9:{
                System.out.println("vRAM, producator");
                System.out.println("Introduceti valoarea vRAM-ului:");
                int vRAM=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduceti denumirea producatorului:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorPlacaVideo.length;i++)
                {if(vectorPlacaVideo[i].getVram()>=vRAM && vectorPlacaVideo[i].getProducator().equals(producator)==true) 
                System.out.println(vectorPlacaVideo[i]);}
                break;}
            case 10:{
                System.out.println("Slot, Rezolutie Maxima");
                System.out.println("Introduceti denumirea slot-ului:");
                String slot = scanner.nextLine();
                System.out.println("Introduceti rezolutia maxima:");
                String rezolutieMaxima = scanner.nextLine();
                for (int i = 0; i < vectorPlacaVideo.length; i++) 
                {if(vectorPlacaVideo[i].getSlot().equals(slot) == true && vectorPlacaVideo[i].getRezolutieMaxima().equals(rezolutieMaxima) == true) {
                System.out.println(vectorPlacaVideo[i]);}
                }
                break;}
            case 11:{
                System.out.println("Slot, pret");
                System.out.println("Introduceti denumirea slot-ului:");
                String slot = scanner.nextLine();
                System.out.println("Introduceti pretul minim:");
                double pret = scanner.nextDouble();
                for (int i = 0; i < vectorPlacaVideo.length; i++) 
                {if (vectorPlacaVideo[i].getSlot().equals(slot) == true && vectorPlacaVideo[i].getPret() >= pret) {
                System.out.println(vectorPlacaVideo[i]);}
                }
                break;}
            case 12:{
                System.out.println("Slot, producator");
                System.out.println("Introduceti denumirea slot-ului:");
                String slot = scanner.nextLine();
                System.out.println("Introduceti denumirea producatorului:");
                String producator = scanner.nextLine();
                for (int i = 0; i < vectorPlacaVideo.length; i++) {
                    if (vectorPlacaVideo[i].getSlot().equals(slot) == true && vectorPlacaVideo[i].getProducator().equals(producator) == true) {
                        System.out.println(vectorPlacaVideo[i]);
                    }
                }
                break;
            }
            case 13:{
                System.out.println("Rezolutie Maxima, pret");
                System.out.println("Introduceti rezolutia maxima:");
                String rezolutieMaxima = scanner.nextLine();
                System.out.println("Introduceti pretul minim:");
                double pret = scanner.nextDouble();
                for (int i = 0; i < vectorPlacaVideo.length; i++) {
                    if (vectorPlacaVideo[i].getRezolutieMaxima().equals(rezolutieMaxima) == true && vectorPlacaVideo[i].getPret() >= pret) {
                        System.out.println(vectorPlacaVideo[i]);
                    }
                }
                break;
            }
            case 14:{
                System.out.println("Rezolutie Maxima, producator");
                System.out.println("Introduceti rezolutia maxima:");
                String rezolutieMaxima = scanner.nextLine();
                System.out.println("Introduceti denumirea producatorului:");
                String producator = scanner.nextLine();
                for (int i = 0; i < vectorPlacaVideo.length; i++) 
                {if (vectorPlacaVideo[i].getRezolutieMaxima().equals(rezolutieMaxima) && vectorPlacaVideo[i].getProducator().equals(producator)){
                System.out.println(vectorPlacaVideo[i]);
                System.out.println(vectorPlacaVideo[i]);
                } 
                }
                break;}
            case 15:{
                System.out.println("pret, producator");
                System.out.println("Introduceti pretul minim:");
                double pret=scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Introduceti denumirea producatorului:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorPlacaVideo.length;i++)
                {if(vectorPlacaVideo[i].getPret()<=pret && vectorPlacaVideo[i].getProducator().equals(producator)==true)
                System.out.println(vectorPlacaVideo[i]);}
                break;}
            default:
                System.out.println("Optiune invalida");
                break;
        }

    }
        
        //Placa de Sunet
        {
        System.out.println("\nVector PlacaDeSunet:");
        PlacaDeSunet placaSunet4 = new PlacaDeSunet("Creative", 5, 120, true, true, 250.0);
        PlacaDeSunet placaSunet5 = new PlacaDeSunet("Logitech", 7, 110, true, true, 180.0);
        PlacaDeSunet placaSunet6 = new PlacaDeSunet("ASUS", 7, 115, true, false, 300.0);
        PlacaDeSunet placaSunet7 = new PlacaDeSunet("Sennheiser", 9, 125, false, true, 400.0);
        PlacaDeSunet placaSunet8 = new PlacaDeSunet("SteelSeries", 5, 105, true, true, 150.0);
        PlacaDeSunet placaSunet9 = new PlacaDeSunet("Behringer", 8, 118, false, true, 120.0);
        PlacaDeSunet placaSunet10 = new PlacaDeSunet("Focusrite", 10, 130, true, false, 500.0);
        PlacaDeSunet placaSunet11 = new PlacaDeSunet("M-Audio", 6, 95, false, true, 90.0);
        PlacaDeSunet placaSunet12 = new PlacaDeSunet("Audio-Technica", 7, 112, false,false, 350.0);
        PlacaDeSunet placaSunet13 = new PlacaDeSunet("Razer", 5, 98, false, false, 200.0);
        PlacaDeSunet[] vectorPlacaDeSunet = {placaSunet4, placaSunet5, placaSunet6, placaSunet7, placaSunet8, placaSunet9, placaSunet10, placaSunet11, placaSunet12, placaSunet13};
        for (int i = 0; i < vectorPlacaDeSunet.length; i++) {
            System.out.println(vectorPlacaDeSunet[i]);
        }
        
        System.out.println("1. Canale Audio, Raport Semnal");
        System.out.println("2. Canale Audio, Suport Dolby Atmos");
        System.out.println("3. Canale Audio, Suport DTSX");
        System.out.println("4. Canale Audio, pret");
        System.out.println("5. Canale Audio, producator");
        System.out.println("6. Raport Semnal, Suport Dolby Atmos ");
        System.out.println("7. Raport Semnal, Suport DTSX");
        System.out.println("8. Raport Semnal, pret");
        System.out.println("9. Raport Semnal, producator");
        System.out.println("10. Suport Dolby Atmos, Suport DTSX");
        System.out.println("11. Suport Dolby Atmos, pret");
        System.out.println("12. Suport Dolby Atmos, producator");      
        System.out.println("13. Suport DTSX, pret");
        System.out.println("14. Suport DTSX, producator");      
        System.out.println("15. pret, producator");
        
        System.out.println("Alege o optiune:");
        int optiunePlacaDeSunet = scanner.nextInt();
        scanner.nextLine();
        
        switch (optiunePlacaDeSunet) {
            case 1:{
                System.out.println("Canale Audio, Raport Semnal");
                System.out.println("Introdu numarul de canale audio minime:");
                int canaleAudioMinime=scanner.nextInt();
                System.out.println("Introdu raportul de semnal minim:");
                int raportSemnalMinim=scanner.nextInt();
                for(int i=0;i<vectorPlacaDeSunet.length;i++)
                {if(vectorPlacaDeSunet[i].getCanaleAudio()>=canaleAudioMinime && vectorPlacaDeSunet[i].getRaportSemnal()>=raportSemnalMinim)
                System.out.println(vectorPlacaDeSunet[i]);
                }
                break;}
         
            case 2:{
                System.out.println("Canale Audio, Suport Dolby Atmos");
                System.out.println("Introdu numarul de canale audio minime:");
                int canaleAudioMinime=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Suport Dolby Atmos(true/false):");
                Boolean suportDolbyAtmos=scanner.nextBoolean();
                for(int i=0;i<vectorPlacaDeSunet.length;i++)
                {if (vectorPlacaDeSunet[i].getCanaleAudio() >= canaleAudioMinime && vectorPlacaDeSunet[i].getSuportDolbyAtmos() == suportDolbyAtmos)
                System.out.println(vectorPlacaDeSunet[i]);}   
                break;}
        
            case 3:{
                System.out.println("Canale Audio, Suport DTSX");      
                System.out.println("Introdu numarul de canale audio minime:");
                int canaleAudioMinime=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Suport DTSX (true/false):");
                Boolean suportDTSX=scanner.nextBoolean();
                for(int i=0;i<vectorPlacaDeSunet.length;i++)
                {if (vectorPlacaDeSunet[i].getCanaleAudio() >= canaleAudioMinime && vectorPlacaDeSunet[i].getSuportDTSX() == suportDTSX)  
                System.out.println(vectorPlacaDeSunet[i]);
                
                }
                break;}
            
            case 4:{
                System.out.println("Canale Audio, pret");
                System.out.println("Introdu numarul de canale audio minime:");
                int canaleAudioMinime=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introdu pretul maxim:");
                double pret=scanner.nextDouble();
                for(int i=0;i<vectorPlacaDeSunet.length;i++)
                {if(vectorPlacaDeSunet[i].getCanaleAudio()>=canaleAudioMinime && vectorPlacaDeSunet[i].getPret()>=pret) 
                System.out.println(vectorPlacaDeSunet[i]);}
                break;}
            
            case 5:{
                System.out.println("Canale Audio, producator");
                System.out.println("Introdu numarul de canale audio minime:");
                int capacitateMinima=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduceti numele producatorului:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorPlacaDeSunet.length;i++)
                {if(vectorPlacaDeSunet[i].getCanaleAudio()>=capacitateMinima && vectorPlacaDeSunet[i].getProducator().equals(producator)==true)
                System.out.println(vectorPlacaDeSunet[i]);}
                break;}
            
            case 6:{
                System.out.println("Raport Semnal, Suport Dolby Atmos");
                System.out.println("Introdu raportul de semnal minim:");
                int raportSemnal=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Suport Dolby Atmos (true/false) :");
                Boolean suportDolbyAtmos=scanner.nextBoolean();
                for(int i=0;i<vectorPlacaDeSunet.length;i++)
                {if (vectorPlacaDeSunet[i].getRaportSemnal() >= raportSemnal && vectorPlacaDeSunet[i].getSuportDTSX() == suportDolbyAtmos) 
                System.out.println(vectorPlacaDeSunet[i]);}
                break;}
            
            case 7:{
                System.out.println("Raport Semnal, Suport DTSX");
                System.out.println("Introdu raportul de semnal minim:");
                int raportSemnal=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Suport DTSX (true/false) :");
                Boolean suportDTSX=scanner.nextBoolean();
                for(int i=0;i<vectorPlacaDeSunet.length;i++)
                {if (vectorPlacaDeSunet[i].getRaportSemnal() >= raportSemnal && vectorPlacaDeSunet[i].getSuportDTSX() == suportDTSX)
                System.out.println(vectorPlacaDeSunet[i]);}
                
                break;}
            
            case 8:{
                System.out.println("Raport Semnal, pret");
                System.out.println("Introdu raportul de semnal minim:");
                int raportSemnal = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introdu pretul minim :");
                double pret = scanner.nextDouble();
                for (int i = 0; i < vectorPlacaDeSunet.length; i++) 
                {if (vectorPlacaDeSunet[i].getRaportSemnal() >= raportSemnal && vectorPlacaDeSunet[i].getPret()>=pret) 
                        System.out.println(vectorPlacaDeSunet[i]);
                    }
                
                break;
            }
            case 9:{
                System.out.println("Raport Semnal, producator");
                System.out.println("Introdu raportul de semnal minim:");
                int raportSemnal = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduceti numele producatorului:");
                String producator = scanner.nextLine();
                for (int i = 0; i < vectorPlacaDeSunet.length; i++) {
                    if (vectorPlacaDeSunet[i].getRaportSemnal() >= raportSemnal && vectorPlacaDeSunet[i].getProducator().equals(producator) == true) {
                        System.out.println(vectorPlacaDeSunet[i]);
                    }
                }
                break;
            }
            case 10:{
                System.out.println("Suport Dolby Atmos, Suport DTSX");
                System.out.println("Suport Dolby Atmos (true/false):");
                Boolean suportDolbyAtmos = scanner.nextBoolean();
                System.out.println("Suport DTSX (true/false):");
                Boolean suportDTSX = scanner.nextBoolean();
                for (int i = 0; i < vectorPlacaDeSunet.length; i++) {
                    if (vectorPlacaDeSunet[i].getSuportDolbyAtmos() == suportDolbyAtmos && vectorPlacaDeSunet[i].getSuportDTSX() == suportDTSX) {
                        System.out.println(vectorPlacaDeSunet[i]);
                    }
                }
                break;
            }
            case 11:{
                System.out.println("Suport Dolby Atmos, pret");
                System.out.println("Suport Dolby Atmos (true/false):");
                Boolean suportDolbyAtmos = scanner.nextBoolean();
                System.out.println("Introdu pretul minim:");
                double pret = scanner.nextDouble();
                for (int i = 0; i < vectorPlacaDeSunet.length; i++) {
                    if (vectorPlacaDeSunet[i].getSuportDolbyAtmos() == suportDolbyAtmos  && vectorPlacaDeSunet[i].getPret()>=pret) 
                        System.out.println(vectorPlacaDeSunet[i]);
                    
                }
                break;
            }
            case 12:{
                System.out.println("Suport Dolby Atmos, producator");
                System.out.println("Suport Dolby Atmos (true/false) :");
                Boolean suportDolbyAtmos = scanner.nextBoolean();
                scanner.nextLine();
                System.out.println("Introduceti numele producatorului:");
                String producator = scanner.nextLine();
                for (int i = 0; i < vectorPlacaDeSunet.length; i++) {
                    if (vectorPlacaDeSunet[i].getSuportDolbyAtmos() == suportDolbyAtmos && vectorPlacaDeSunet[i].getProducator().equals(producator) == true) 
                        System.out.println(vectorPlacaDeSunet[i]);
                    }
                
                break;
            }
            case 13:{
                System.out.println("Suport DTSX, pret");
                System.out.println("Suport DTSX (true/false):");
                Boolean suportDTSX = scanner.nextBoolean();
                System.out.println("Introdu pretul minim:");
                double pret = scanner.nextDouble();
                for (int i = 0; i < vectorPlacaDeSunet.length; i++) {
                    if (vectorPlacaDeSunet[i].getSuportDTSX() == suportDTSX && vectorPlacaDeSunet[i].getPret()>=pret) 
                        System.out.println(vectorPlacaDeSunet[i]);
                    }
                
                break;
            }
            case 14:{
                System.out.println("Suport DTSX, producator");
                System.out.println("Suport DTSX (true/false):");
                Boolean suportDTSX = scanner.nextBoolean();
                scanner.nextLine();
                System.out.println("Introduceti numele producatorului:");
                String producator = scanner.nextLine();
                for (int i = 0; i < vectorPlacaDeSunet.length; i++) {
                    if (vectorPlacaDeSunet[i].getSuportDTSX() == suportDTSX && vectorPlacaDeSunet[i].getProducator().equals(producator) == true) 
                        System.out.println(vectorPlacaDeSunet[i]);
                    }
                
                break;
            }
            case 15:{
                System.out.println("pret, producator");
                System.out.println("Introduceti pretul maxim:");
                double pret=scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Introduceti numele producatorului:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorPlacaDeSunet.length;i++)
                {if(vectorPlacaDeSunet[i].getPret()>=pret && vectorPlacaDeSunet[i].getProducator().equals(producator)==true)
                System.out.println(vectorPlacaDeSunet[i]);}
                break;}
            default:
                System.out.println("Optiune invalida");
                break;
        }

    }
        
        //Sursa
        {        
        System.out.println("\nVector Sursa:");
        Sursa sursa4 = new Sursa("EVGA", "ATX",650,120);
        Sursa sursa5 = new Sursa("ASUS", "Micro-ATX",700,130);
        Sursa sursa6 = new Sursa("ASRock", "Mini-ITX",600,100);
        Sursa sursa7 = new Sursa("ASUS", "ATX",680,150);
        Sursa sursa8 = new Sursa("ASUS", "ATX",550,110);
        Sursa sursa9 = new Sursa("Gigabyte", "Micro-ATX",950,140);
        Sursa sursa10 = new Sursa("MSI", "Mini-ITX",500,90);
        Sursa sursa11 = new Sursa("EVGA", "ATX",980,170);
        Sursa sursa12 = new Sursa("HT Omega", "Micro-ATX",700,130);
        Sursa sursa13 = new Sursa("Auzentech", "Mini-ITX",650,120);
        Sursa[] vectorSursa = {sursa4,sursa5,sursa6,sursa7,sursa8,sursa9,sursa10,sursa11,sursa12,sursa13}; 
        for(int i=0;i<vectorSursa.length;i++)
       { 
           System.out.println(vectorSursa[i]);
       }
     
        System.out.println("1. Producator, pret");
	System.out.println("2. Producator, format");
        System.out.println("3. Producator, putere");
	System.out.println("4. Pret, format");
        System.out.println("5. Pret, putere");
        System.out.println("6. Format, putere");
	
	System.out.println("Alege o optiune:");
        int optiuneSursa = scanner.nextInt();
        scanner.nextLine();
        
        switch (optiuneSursa) {
            case 1:{
                System.out.println("1. Producator, pret");
                System.out.println("Introdu producatorul:");
                String producator=scanner.nextLine();
                System.out.println("Introdu pretul maxim:");
                double pret=scanner.nextDouble();
                for(int i=0;i<vectorSursa.length;i++)
                {if(vectorSursa[i].getProducator().equals(producator)==true && vectorSursa[i].getPret()<=pret) 
                System.out.println(vectorSursa[i]);
                }
                break;}
            case 2:{
                System.out.println("2. Producator, format");
                System.out.println("Introdu producatorul:");
                String producator=scanner.nextLine();
                System.out.println("Introdu format:");
                String format=scanner.nextLine();
                for(int i=0;i<vectorSursa.length;i++)
                {if(vectorSursa[i].getProducator().equals(producator)==true && vectorSursa[i].getFormat().equals(format)==true) 
                System.out.println(vectorSursa[i]);
                }
                break;}
            case 3:{
                System.out.println("3. Producator, putere");
                System.out.println("Introdu producatorul:");
                String producator=scanner.nextLine();
                System.out.println("Introdu puterea:");
                double putere=scanner.nextDouble();
                for(int i=0;i<vectorSursa.length;i++)
                {if(vectorSursa[i].getProducator().equals(producator)==true  && vectorSursa[i].getPutere()>=putere) 
                System.out.println(vectorSursa[i]);}
                break;
                }
            case 4:{
                System.out.println("4. Pret, format");
                System.out.println("Introdu pretul maxim:");
                double pret=scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Introdu format:");
                String format=scanner.nextLine();
                for(int i=0;i<vectorSursa.length;i++)
                {if(vectorSursa[i].getPret()<=pret && vectorSursa[i].getFormat().equals(format)==true) 
                System.out.println(vectorSursa[i]);}
                break;}
            case 5:{
                System.out.println("5. Pret, putere");
                System.out.println("Introdu pretul maxim:");
                double pret=scanner.nextDouble();
                System.out.println("Introdu putere:");
                int putere=scanner.nextInt();
                for(int i=0;i<vectorSursa.length;i++)
                {if(vectorSursa[i].getPret()<=pret && vectorSursa[i].getPutere()>=putere) 
                System.out.println(vectorSursa[i]);}
                break;}
            case 6:{
                System.out.println("6. Format, putere");
                System.out.println("Introduceti foramtul:");
                String format=scanner.nextLine();
                System.out.println("Introduceti putere:");
                int putere=scanner.nextInt();
                for(int i=0;i<vectorSursa.length;i++)
                {if(vectorSursa[i].getFormat().equals(format)==true && vectorSursa[i].getPutere()>=putere) 
                System.out.println(vectorSursa[i]);}
                break;}
                default:
                System.out.println("Optiune invalida"); 
        }
    } 
        
        //Carcasa
        {      
        System.out.println("\nVector Carcasa:");
        Carcasa carcasa4 = new Carcasa("Corsair", "Mid Tower", "ATX", "Negru", 3, 2, 8f, 350);
        Carcasa carcasa5 = new Carcasa("NZXT", "Full Tower", "E-ATX", "Alb", 5, 3, 7f, 500);
        Carcasa carcasa6 = new Carcasa("Cooler Master", "Mini Tower", "Micro-ATX", "Argintiu", 2, 1, 4f, 150);
        Carcasa carcasa7 = new Carcasa("Fractal Design", "Mid Tower", "ATX", "Gri", 4, 2, 6f, 280);
        Carcasa carcasa8 = new Carcasa("Thermaltake", "Full Tower", "ATX", "Rosu", 6, 4, 12f, 600);
        Carcasa carcasa9 = new Carcasa("Antec", "Mid Tower", "ATX", "Verde", 3, 2, 5f, 320);
        Carcasa carcasa10 = new Carcasa("BitFenix", "Mini Tower", "Micro-ATX", "Portocaliu", 2, 1, 4.5f, 180);
        Carcasa carcasa11 = new Carcasa("SilverStone", "Full Tower", "E-ATX", "Aluminiu", 7, 5, 3f, 700);
        Carcasa carcasa12 = new Carcasa("InWin", "Mid Tower", "ATX", "Auriu", 4, 3, 8.5f, 400);
        Carcasa carcasa13 = new Carcasa("Phanteks", "Mini Tower", "ITX", "Albastru", 1, 1, 3f, 120);
        Carcasa[] vectorCarcasa = {carcasa4,carcasa5,carcasa6,carcasa7,carcasa8,carcasa9,carcasa10,carcasa11,carcasa12,carcasa13};
        for(int i=0;i<vectorCarcasa.length;i++)
       { 
           System.out.println(vectorCarcasa[i]);
       }
        System.out.println("Selecteaza o optiune:");
        System.out.println("1. Dimensiuni, culoare ");
        System.out.println("2. Dimensiuni, nrTotalVentilatoare ");
        System.out.println("3. Dimensiuni, pret");
        System.out.println("4. Dimensiuni, producator");
        System.out.println("5. Culoare, nrTotalVentilatoare");
        System.out.println("6. Culoare, pret");
        System.out.println("7. Culoare, producator");
        System.out.println("8. NrTotalVentilatoare, pret");
        System.out.println("9. NrTotalVentilatoare, producator ");
        System.out.println("10.Pret, producator");
        System.out.println("Alege o optiune:");
         int optiuneCarcasa = scanner.nextInt();
        switch (optiuneCarcasa) {
            case 1:{
                System.out.println("Ai selectat: Dimensiuni, culoare");
                System.out.println("Introduceti dimensiunie:");
                scanner.nextLine();
                String dimensiuni=scanner.nextLine();
                System.out.println("Introduceti culoare:");
                String culoare=scanner.nextLine();
                for(int i=0;i<vectorCarcasa.length;i++)
       {        if(vectorCarcasa[i].dimensiuni.equals(dimensiuni)==true && vectorCarcasa[i].culoare.equals(culoare)==true)
                    System.out.println(vectorCarcasa[i]);
       }
                
                
                break;}
            case 2:{
                System.out.println("Ai selectat: Dimensiuni, nrTotalVentilatoare");
                System.out.println("Introduceti dimensiunie:");
                scanner.nextLine();
                String dimensiuni=scanner.nextLine();
                System.out.println("Introduceti nrVentilatoare minim:");
                int nrVentilatoareMinim=scanner.nextInt();
                for(int i=0;i<vectorCarcasa.length;i++)
       {        if(vectorCarcasa[i].dimensiuni.equals(dimensiuni)==true && vectorCarcasa[i].nrVentilatoareIncluse>=nrVentilatoareMinim)
                    System.out.println(vectorCarcasa[i]);
       }
                break;}
            case 3:{
                System.out.println("Ai selectat: Dimensiuni, pret");
                System.out.println("Introduceti dimensiunie:");
                scanner.nextLine();
                String dimensiuni=scanner.nextLine();
                System.out.println("Introduceti pret maxim:");
                double pret=scanner.nextDouble();
                for(int i=0;i<vectorCarcasa.length;i++)
       {        if(vectorCarcasa[i].dimensiuni.equals(dimensiuni)==true && vectorCarcasa[i].pret<=pret)
                    System.out.println(vectorCarcasa[i]);
       }
                break;}
            case 4:{
                System.out.println("Ai selectat: Dimensiuni, producator");
                System.out.println("Introduceti dimensiunie:");
                scanner.nextLine();
                String dimensiuni=scanner.nextLine();
                System.out.println("Introduceti producatorul:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorCarcasa.length;i++)
       {        if(vectorCarcasa[i].dimensiuni.equals(dimensiuni)==true && vectorCarcasa[i].producator.equals(producator)==true)
                    System.out.println(vectorCarcasa[i]);
       }
                break;}
            case 5:{
                System.out.println("Ai selectat: Culoare, nrTotalVentilatoare");
                System.out.println("Introduceti culoare:");
                scanner.nextLine();
                String culoare=scanner.nextLine();
                System.out.println("Introduceti nrVentilatoare minim:");
                int nrVentilatoareMinim=scanner.nextInt();
                for(int i=0;i<vectorCarcasa.length;i++)
       {        if(vectorCarcasa[i].culoare.equals(culoare)==true && vectorCarcasa[i].nrVentilatoareIncluse>=nrVentilatoareMinim)
                    System.out.println(vectorCarcasa[i]);
       }
                break;}
            case 6:{
                System.out.println("Ai selectat: Culoare, pret");
                System.out.println("Introduceti culoare:");
                scanner.nextLine();
                String culoare=scanner.nextLine();
                System.out.println("Introduceti pret maxim:");
                double pret=scanner.nextDouble();
                for(int i=0;i<vectorCarcasa.length;i++)
       {        if(vectorCarcasa[i].culoare.equals(culoare)==true && vectorCarcasa[i].pret<=pret)
                    System.out.println(vectorCarcasa[i]);
       }
                break;}
            case 7:{
                System.out.println("Ai selectat: Culoare, producator");
                System.out.println("Introduceti culoare:");
                scanner.nextLine();
                String culoare=scanner.nextLine();
                System.out.println("Introduceti producatorul:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorCarcasa.length;i++)
       {        if(vectorCarcasa[i].culoare.equals(culoare)==true && vectorCarcasa[i].producator.equals(producator)==true)
                    System.out.println(vectorCarcasa[i]);
       }
                break;}
            case 8:{
                System.out.println("Ai selectat: NrTotalVentilatoare, pret");
                System.out.println("Introduceti nrVentilatoare minim:");
                int nrVentilatoare=scanner.nextInt();
                System.out.println("Introduceti pretul maxim:");
                double pret=scanner.nextDouble();
                for(int i=0;i<vectorCarcasa.length;i++)
       {        if(vectorCarcasa[i].nrTotalVentilatoare>=nrVentilatoare && vectorCarcasa[i].pret<=pret)
                    System.out.println(vectorCarcasa[i]);
       }
                break;}
            case 9:{
                System.out.println("Ai selectat: NrTotalVentilatoare, producator");
                System.out.println("Introduceti nrVentilatoare minim:");
                int nrVentilatoare=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduceti producatorul:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorCarcasa.length;i++)
       {        if(vectorCarcasa[i].nrTotalVentilatoare>=nrVentilatoare && vectorCarcasa[i].producator.equals(producator)==true)
                    System.out.println(vectorCarcasa[i]);
       }
                break;}
            case 10:{
                System.out.println("Ai selectat: Pret, producator");
                System.out.println("Introduceti pretul maxim:");
                double pret=scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Introduceti producatorul:");
                String producator=scanner.nextLine();
                for(int i=0;i<vectorCarcasa.length;i++)
       {        if(vectorCarcasa[i].pret<=pret && vectorCarcasa[i].producator.equals(producator)==true)
                    System.out.println(vectorCarcasa[i]);
       }
                break;}
            default:
                System.out.println("Optiune invalida");
        }
    }      
        
           scanner.close();   
*/
    }
}