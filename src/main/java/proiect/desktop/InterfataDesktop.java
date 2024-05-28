/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proiect.desktop;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.DefaultComboBoxModel;
import static proiect.desktop.ScriereCitireFisiere.readObjectsFromFileCarcasa;
import static proiect.desktop.ScriereCitireFisiere.readObjectsFromFileHardDisk;
import static proiect.desktop.ScriereCitireFisiere.readObjectsFromFileMemorieRAM;
import static proiect.desktop.ScriereCitireFisiere.readObjectsFromFilePlacaDeBaza;
import static proiect.desktop.ScriereCitireFisiere.readObjectsFromFilePlacaDeSunet;
import static proiect.desktop.ScriereCitireFisiere.readObjectsFromFilePlacaVideo;
import static proiect.desktop.ScriereCitireFisiere.readObjectsFromFileProcesor;
import static proiect.desktop.ScriereCitireFisiere.readObjectsFromFileSursa;
import static proiect.desktop.ScriereCitireFisiere.writeObjectsToFileCarcasa;
import static proiect.desktop.ScriereCitireFisiere.writeObjectsToFileHardDisk;
import static proiect.desktop.ScriereCitireFisiere.writeObjectsToFileMemorieRAM;
import static proiect.desktop.ScriereCitireFisiere.writeObjectsToFilePlacaDeBaza;
import static proiect.desktop.ScriereCitireFisiere.writeObjectsToFilePlacaDeSunet;
import static proiect.desktop.ScriereCitireFisiere.writeObjectsToFilePlacaVideo;
import static proiect.desktop.ScriereCitireFisiere.writeObjectsToFileProcesor;
import static proiect.desktop.ScriereCitireFisiere.writeObjectsToFileSursa;
/**
 *
 * @author md401
 */
public class InterfataDesktop extends javax.swing.JFrame {

    /**
     * Creates new form InterfataDesktop
     */
    public InterfataDesktop() {
        initComponents();
        
        writeObjectsToFilePlacaVideo();
        readObjectsFromFilePlacaVideo();
        
        writeObjectsToFilePlacaDeSunet();
        readObjectsFromFilePlacaDeSunet();
        
        writeObjectsToFileProcesor();
        readObjectsFromFileProcesor();
        
        writeObjectsToFilePlacaDeBaza();
        readObjectsFromFilePlacaDeBaza();
        
        writeObjectsToFileSursa();
        readObjectsFromFileSursa();
        
        writeObjectsToFileCarcasa();
        readObjectsFromFileCarcasa();
        
        writeObjectsToFileMemorieRAM();
        readObjectsFromFileMemorieRAM();
        
        writeObjectsToFileHardDisk();
        readObjectsFromFileHardDisk();
        
        jComboBox1.addItem("---");
        jComboBox9.addItem("---");
        jComboBox10.addItem("---");
        jComboBox9.addActionListener(jComboBox1);
        jComboBox10.addActionListener(jComboBox1);
        jComboBox1.setSelectedItem("---");
        for (PlacaVideo pv : vectorPlacaVideo) {
            jComboBox1.addItem(pv.toString());
        }
        Set<String> setProducator = new TreeSet<>();
        for (PlacaVideo pv : vectorPlacaVideo) {
            setProducator.add(pv.getProducator());
        }
         jComboBox1.setSelectedItem("---");
        for (String s1 : setProducator) {
            jComboBox9.addItem(s1);
        }

        Set<Integer> setVram = new TreeSet<>();
        for (PlacaVideo pv : vectorPlacaVideo) {
            setVram.add(pv.getVram());
        }
        jComboBox1.setSelectedItem("---");
        for (Integer vRAM : setVram) {
            jComboBox10.addItem(String.valueOf(vRAM));
        }
        
        
        
        jComboBox2.addItem("---");
        jComboBox11.addItem("---");
        jComboBox12.addItem("---");
        jComboBox11.addActionListener(jComboBox2);
        jComboBox12.addActionListener(jComboBox2);
        jComboBox2.setSelectedItem("---");
        for (PlacaDeSunet ps : vectorPlacaDeSunet) {
            jComboBox2.addItem(ps.toString());
        }
        Set<Integer> setCanaleAudio = new TreeSet<>();
        for (PlacaDeSunet ps : vectorPlacaDeSunet) {
            setCanaleAudio.add(ps.getCanaleAudio());
        }
        for (Integer canaleAudio : setCanaleAudio) {
            jComboBox11.addItem(String.valueOf(canaleAudio));
        }

        Set<Boolean> setSuportDolbyAtmos = new TreeSet<>();
        for (PlacaDeSunet ps : vectorPlacaDeSunet) {
            setSuportDolbyAtmos.add(ps.getSuportDolbyAtmos());
        }

        for (Boolean b1 : setSuportDolbyAtmos) {
            jComboBox12.addItem(String.valueOf(b1));
        }
        
        
        
        jComboBox3.addItem("---");
        jComboBox13.addItem("---");
        jComboBox14.addItem("---");
        jComboBox13.addActionListener(jComboBox3);
        jComboBox14.addActionListener(jComboBox3);
               
        for(Procesor procesor : vectorProcesor){
            jComboBox3.addItem(procesor.toString());
        }
        
        Set<String> producatorProcesor=new HashSet<>();
        for(Procesor procesor : vectorProcesor){
            producatorProcesor.add(procesor.getProducator());
        }
        for(String x : producatorProcesor){
            jComboBox13.addItem(x);
        }
            
        Set<Integer> generatieProcesor=new TreeSet<>();
        for(Procesor procesor : vectorProcesor){
            generatieProcesor.add(procesor.getGeneratie());
        }
        for(Integer x : generatieProcesor){
            jComboBox14.addItem(String.valueOf(x));
        }
        
        
        
        jComboBox4.addItem("---");
        jComboBox15.addItem("---");
        jComboBox16.addItem("---");
        jComboBox15.addActionListener(jComboBox4);
        jComboBox16.addActionListener(jComboBox4);
        
        for(PlacaDeBaza placaDeBaza : vectorPlacaDeBaza){
            jComboBox4.addItem(placaDeBaza.toString());
        }
        
        Set<String> formatPlacaDeBaza=new HashSet<>();
        for(PlacaDeBaza placaDeBaza : vectorPlacaDeBaza){
            formatPlacaDeBaza.add(placaDeBaza.getTipMemorie());
        }
        for(String x : formatPlacaDeBaza){
            jComboBox15.addItem(x);
        }
            
        Set<Integer> nrUSBPlacaDeBaza=new TreeSet<>();
        for(PlacaDeBaza placaDeBaza : vectorPlacaDeBaza){
            nrUSBPlacaDeBaza.add(placaDeBaza.getPorturiUSB());
        }
        for(Integer x : nrUSBPlacaDeBaza){
            jComboBox16.addItem(String.valueOf(x));
        }
        
        
        
        jComboBox5.addItem("---");
        jComboBox17.addItem("---");
        jComboBox18.addItem("---");
        jComboBox17.addActionListener(jComboBox5);
        jComboBox18.addActionListener(jComboBox5);
        
        for(Sursa sursa : vectorSursa){
            jComboBox5.addItem(sursa.toString());
        }
        
        Set<String> producatorSursa=new HashSet<>();
        for(Sursa sursa : vectorSursa){
            producatorSursa.add(sursa.getProducator());
        }
        for(String x : producatorSursa){
            jComboBox17.addItem(x);
        }
            
        Set<Integer> putereSursa=new TreeSet<>();
        for(Sursa sursa : vectorSursa){
            putereSursa.add(sursa.getPutere());
        }
        for(Integer x : putereSursa){
            jComboBox18.addItem(String.valueOf(x));
        }
        
        
        
        
        jComboBox6.addItem("---");
        jComboBox23.addItem("---");
        jComboBox24.addItem("---");
        jComboBox23.addActionListener(jComboBox6);
        jComboBox24.addActionListener(jComboBox6);
        
        for(Carcasa carcasa : vectorCarcasa){
            jComboBox6.addItem(carcasa.toString());
        }
        
        Set<String> culoareCarcasa=new HashSet<>();
        for(Carcasa carcasa : vectorCarcasa){
            culoareCarcasa.add(carcasa.getCuloare());
        }
        for(String x : culoareCarcasa){
            jComboBox23.addItem(x);
        }
            
        Set<String> dimensiuneCarcasa=new HashSet<>();
        for(Carcasa carcasa : vectorCarcasa){
            dimensiuneCarcasa.add(carcasa.getDimensiuni());
        }
        for(String x : dimensiuneCarcasa){
            jComboBox24.addItem(x);
        }
        
        
        
        
        jComboBox7.addItem("---");
        jComboBox19.addItem("---");
        jComboBox20.addItem("---");
        jComboBox19.addActionListener(jComboBox7);
        jComboBox20.addActionListener(jComboBox7);
        //Adaugare obiecte in jcombobox7
       jComboBox7.setSelectedItem("---");
        for (MemorieRAM mem1:vectorMemorieRAM)
        {
        jComboBox7.addItem(mem1.toString());
        }
        Set<Integer> setCapacitati =  new TreeSet<>();
        for (MemorieRAM mem1:vectorMemorieRAM)
        {
         setCapacitati.add(mem1.getCapacitate());
        }
        for (Integer capacitate : setCapacitati) {
    jComboBox19.addItem(String.valueOf(capacitate));
       }

         Set<String> setTipMemorie =  new TreeSet<>();
        for (MemorieRAM mem1:vectorMemorieRAM)
        {
         setTipMemorie.add(mem1.getTipMemorie());
        }

        for(String s1:setTipMemorie)
        {
        jComboBox20.addItem(s1);
        }
        
        
        
        
        jComboBox8.addItem("---");
        jComboBox21.addItem("---");
        jComboBox22.addItem("---");
        jComboBox21.addActionListener(jComboBox8);
        jComboBox22.addActionListener(jComboBox8);
               
        for(HardDisk hardDisk : vectorHardDisk){
            jComboBox8.addItem(hardDisk.toString());
        }
        
        Set<Integer> memmorieHardDisk=new TreeSet<>();
        for(HardDisk hardDisk : vectorHardDisk){
            memmorieHardDisk.add(hardDisk.getCapacitate());
        }
        for(Integer x : memmorieHardDisk){
            jComboBox21.addItem(x.toString());
        }
            
        Set<Integer> vitezaHardDisk=new TreeSet<>();
        for(HardDisk hardDisk : vectorHardDisk){
            vitezaHardDisk.add(hardDisk.getViteza());
        }
        for(Integer x : vitezaHardDisk){
            jComboBox22.addItem(x.toString());
        }

    }
        
        PlacaVideo placaVideo4 = new PlacaVideo("Gigabyte", "NVIDIA RTX 3080", 16, "PCI Express 4.0", "7680x4320", 1500.0);
        PlacaVideo placaVideo5 = new PlacaVideo("MSI", "AMD RX 6800 XT", 16, "PCI Express 4.0", "7680x4320", 1700.0);
        PlacaVideo placaVideo6 = new PlacaVideo("Gigabyte", "NVIDIA GTX 1660 Super", 6, "PCI Express 3.0", "1920x1080", 300.0);
        PlacaVideo placaVideo7 = new PlacaVideo("MSI", "AMD RX 5700 XT", 4, "PCI Express 4.0", "2560x1440", 1200.0);
        PlacaVideo placaVideo8 = new PlacaVideo("Gigabyte", "NVIDIA GTX 1650", 4, "PCI Express 3.0", "2560x1600", 200.0);
        PlacaVideo placaVideo9 = new PlacaVideo("MSI", "AMD RX 5500 XT", 8, "PCI Express 4.0", "1920x1080", 250.0);
        PlacaVideo placaVideo10 = new PlacaVideo("Gigabyte", "NVIDIA RTX 3060", 12, "PCI Express 4.0", "7680x4320", 400.0);
        PlacaVideo placaVideo11 = new PlacaVideo("MSI", "AMD RX 6700 XT", 12, "PCI Express 4.0", "2560x1440", 1500.0);
        PlacaVideo placaVideo12 = new PlacaVideo("Gigabyte", "NVIDIA GTX 1050 Ti", 8, "PCI Express 3.0", "1920x1080", 150.0);
        PlacaVideo placaVideo13 = new PlacaVideo("MSI", "NVIDIA GTX 1660", 6, "PCI Express 3.0", "1920x1080", 250.0);
        PlacaVideo[] vectorPlacaVideo = {placaVideo4, placaVideo5, placaVideo6, placaVideo7, placaVideo8 ,placaVideo9, placaVideo10, placaVideo11, placaVideo12, placaVideo13};
        
    
        PlacaDeSunet placaSunet4 = new PlacaDeSunet("Creative", 4, 120, true, true, 250.0);
        PlacaDeSunet placaSunet5 = new PlacaDeSunet("Logitech", 5, 110, false, true, 180.0);
        PlacaDeSunet placaSunet6 = new PlacaDeSunet("ASUS", 7, 115, true, false, 300.0);
        PlacaDeSunet placaSunet7 = new PlacaDeSunet("Sennheiser", 8, 125, false, true, 400.0);
        PlacaDeSunet placaSunet8 = new PlacaDeSunet("SteelSeries", 9, 105, true, false, 150.0);
        PlacaDeSunet placaSunet9 = new PlacaDeSunet("Behringer", 4, 118, false, true, 120.0);
        PlacaDeSunet placaSunet10 = new PlacaDeSunet("Focusrite", 5, 130, true, true, 500.0);
        PlacaDeSunet placaSunet11 = new PlacaDeSunet("M-Audio", 7, 95, false, false, 90.0);
        PlacaDeSunet placaSunet12 = new PlacaDeSunet("Audio-Technica", 8, 112, true, false, 350.0);
        PlacaDeSunet placaSunet13 = new PlacaDeSunet("Razer", 9, 98, false, true, 200.0);
        PlacaDeSunet[] vectorPlacaDeSunet = {placaSunet4, placaSunet5, placaSunet6, placaSunet7, placaSunet8, placaSunet9, placaSunet10, placaSunet11, placaSunet12, placaSunet13};
           
        Procesor procesor4 = new Procesor("Intel",9,11900, "K", 5.3f, 8, 16, "LGA1200", 550.0);
        Procesor procesor5 = new Procesor("AMD",9,5950, "X", 4.9f, 16, 64, "AM4", 800.0);
        Procesor procesor6 = new Procesor("Intel",7,11700, "K", 5.0f, 8, 16, "LGA1200", 400.0);
        Procesor procesor7 = new Procesor("AMD",5,5600, "X", 4.6f, 6, 32, "AM4", 300.0);
        Procesor procesor8 = new Procesor("Intel",5,11400, "", 4.4f, 6, 12, "LGA1200", 250.0);
        Procesor procesor9 = new Procesor("AMD",7,5800, "X", 4.7f, 8, 32, "AM4", 600.0);
        Procesor procesor10 = new Procesor("Intel",3,10900, "K", 5.3f, 10, 20, "LGA1200", 700.0);
        Procesor procesor11 = new Procesor("AMD",3,3300, "X", 4.3f, 4, 16, "AM4", 150.0);
        Procesor[] vectorProcesor = {procesor4,procesor5,procesor6,procesor7,procesor8,procesor9,procesor10,procesor11};
  
        PlacaDeBaza placa4 = new PlacaDeBaza("Asus", "LGA1200", "Intel Z490", "DDR4", 64, 5000, 10, 600);
        PlacaDeBaza placa5 = new PlacaDeBaza("Gigabyte", "AM4", "AMD B450", "DDR4", 32, 3600, 6, 300);
        PlacaDeBaza placa6 = new PlacaDeBaza("MSI", "LGA1151", "Intel H310", "DDR4", 16, 2666, 4, 150);
        PlacaDeBaza placa7 = new PlacaDeBaza("ASRock", "AM4", "AMD X570", "DDR4", 128, 6000, 8, 800);
        PlacaDeBaza placa8 = new PlacaDeBaza("Biostar", "LGA1200", "Intel B460", "DDR3", 32, 3200, 4, 400);
        PlacaDeBaza placa9 = new PlacaDeBaza("ECS", "AM4", "AMD A520", "DDR3", 16, 3000, 6, 250);
        PlacaDeBaza placa10 = new PlacaDeBaza("Colorful", "LGA1151", "Intel Z390", "DDR3", 64, 4400, 10, 550);
        PlacaDeBaza placa11 = new PlacaDeBaza("Aorus", "AM4", "AMD B550", "DDR3", 128, 6400, 8, 900);
        PlacaDeBaza placa12 = new PlacaDeBaza("ASUS ROG", "LGA1200", "Intel Z590", "DDR5", 64, 5600, 8, 750);
        PlacaDeBaza placa13 = new PlacaDeBaza("MSI MPG", "AM4", "AMD X470", "DDR5", 32, 3800, 6, 500);
        PlacaDeBaza placa14 = new PlacaDeBaza("ASRock", "AM4", "AMD X570", "DDR5", 128, 6000, 10, 800);
        PlacaDeBaza placa15 = new PlacaDeBaza("Biostar", "LGA1200", "Intel B460", "DDR5", 32, 3200, 4, 400);
        PlacaDeBaza[] vectorPlacaDeBaza = {placa4,placa5,placa6,placa7,placa8,placa9,placa10,placa11,placa12,placa13,placa14,placa15}; 
    
        Sursa sursa4 = new Sursa("EVGA", "ATX",550,120);
        Sursa sursa5 = new Sursa("ASUS", "Micro-ATX",950,130);
        Sursa sursa6 = new Sursa("EVGA", "Mini-ITX",650,100);
        Sursa sursa7 = new Sursa("ASUS", "ATX",800,150);
        Sursa sursa8 = new Sursa("EVGA", "ATX",800,110);
        Sursa sursa9 = new Sursa("ASUS", "Micro-ATX",650,140);
        Sursa sursa10 = new Sursa("EVGA", "Mini-ITX",950,90);
        Sursa sursa11 = new Sursa("ASUS", "ATX",550,170);
        Sursa sursa12 = new Sursa("EVGA", "Micro-ATX",750,130);
        Sursa sursa13 = new Sursa("ASUS", "Mini-ITX",850,120);
        Sursa sursa14 = new Sursa("EVGA", "ATX",850,120);
        Sursa sursa15 = new Sursa("ASUS", "Micro-ATX",750,130);
        Sursa[] vectorSursa = {sursa4,sursa5,sursa6,sursa7,sursa8,sursa9,sursa10,sursa11,sursa12,sursa13,sursa14,sursa15};
     
        Carcasa carcasa4 = new Carcasa("Corsair", "Mid Tower", "ATX", "Negru", 3, 2, 8f, 350);
        Carcasa carcasa5 = new Carcasa("NZXT", "Full Tower", "E-ATX", "Negru", 5, 3, 7f, 500);
        Carcasa carcasa6 = new Carcasa("Cooler Master", "Mini Tower", "Micro-ATX", "Negru", 2, 1, 4f, 150);
        Carcasa carcasa7 = new Carcasa("Fractal Design", "Mid Tower", "ATX", "Rosu", 4, 2, 6f, 280);
        Carcasa carcasa8 = new Carcasa("Thermaltake", "Full Tower", "ATX", "Alb", 6, 4, 12f, 600);
        Carcasa carcasa9 = new Carcasa("Antec", "Mid Tower", "E-ATX", "Alb", 3, 2, 5f, 320);
        Carcasa carcasa10 = new Carcasa("BitFenix", "Mini Tower", "Micro-ATX", "Alb", 2, 1, 4.5f, 180);
        Carcasa carcasa11 = new Carcasa("SilverStone", "Full Tower", "E-ATX", "Rosu", 7, 5, 3f, 700);
        Carcasa carcasa12 = new Carcasa("InWin", "Mid Tower", "Micro-ATX", "Rosu", 4, 3, 8.5f, 400);
        Carcasa carcasa13 = new Carcasa("Phanteks", "Mini Tower", "ATX", "Gri", 1, 1, 3f, 120);
        Carcasa carcasa14 = new Carcasa("Thermaltake", "Full Tower", "E-ATX", "Gri", 6, 4, 12f, 600);
        Carcasa carcasa15 = new Carcasa("Antec", "Mid Tower", "Micro-ATX", "Gri", 3, 2, 5f, 320);
        Carcasa[] vectorCarcasa = {carcasa4,carcasa5,carcasa6,carcasa7,carcasa8,carcasa9,carcasa10,carcasa11,carcasa12,carcasa13,carcasa14,carcasa15};
       
        MemorieRAM memorie3 = new MemorieRAM("Corsair", "DDR3", 8, 1333, 1.35, "CL16", 50);
        MemorieRAM memorie4 = new MemorieRAM("Kingston", "DDR3", 16, 1600, 1.20, "CL15", 100);
        MemorieRAM memorie5 = new MemorieRAM("ADATA", "DDR3", 32, 1600, 1.35, "CL16", 200);
        MemorieRAM memorie13 = new MemorieRAM("ADATA", "DDR3", 64, 1600, 1.35, "CL16", 300);
        MemorieRAM memorie6 = new MemorieRAM("Corsair", "DDR4", 64, 3200, 1.35, "CL16", 700);
        MemorieRAM memorie7 = new MemorieRAM("Kingston", "DDR4", 8, 3200, 1.20, "CL15", 100);
        MemorieRAM memorie8 = new MemorieRAM("ADATA", "DDR4", 16, 3200, 1.20, "CL16", 200);
        MemorieRAM memorie9 = new MemorieRAM("Corsair", "DDR4", 32, 3200, 1.35, "CL16", 400);
        MemorieRAM memorie10 = new MemorieRAM("Kingston", "DDR5", 8, 5200, 1.25, "CL40", 200);
        MemorieRAM memorie14 = new MemorieRAM("Kingston", "DDR5", 16, 5200, 1.25, "CL40", 400);
        MemorieRAM memorie11 = new MemorieRAM("ADATA", "DDR5", 32, 5200, 1.25, "CL40", 500);
        MemorieRAM memorie12 = new MemorieRAM("Corsair", "DDR5", 64, 5200, 1.30, "CL40", 1000);
        MemorieRAM[] vectorMemorieRAM = {memorie3, memorie4, memorie5,memorie13, memorie7, memorie8, memorie9, memorie6, memorie10,  memorie14, memorie11, memorie12};
      
        HardDisk hard3 = new HardDisk("Seagate", 1000, 5400, 32, "SATA", 2.5, 200);
        HardDisk hard4 = new HardDisk("Kingston", 500, 7200, 128, "SATA", 2.5, 150);
        HardDisk hard5 = new HardDisk("Samsung", 500, 5400, 256, "SATA", 3.5, 150);
        HardDisk hard6 = new HardDisk("Western Digital", 500, 7200, 64, "SATA", 3.5, 150);
        HardDisk hard7 = new HardDisk("Seagate", 500, 5400, 32, "SATA", 2.5, 100);
        HardDisk hard8 = new HardDisk("Kingston", 1000, 7200, 128, "SATA", 3.5, 150);
        HardDisk hard9 = new HardDisk("Samsung", 1000, 5400, 64, "SATA", 2.5, 200);
        HardDisk hard10 = new HardDisk("Western Digital", 1000, 7200, 256, "SATA3", 3.5, 250);
        HardDisk hard11 = new HardDisk("Seagate", 500, 5400, 32, "SATA", 2.5, 100);
        HardDisk hard12 = new HardDisk("Samsung", 1000, 7200, 128, "SATA", 3.5, 200);    
        HardDisk[] vectorHardDisk = { hard3, hard4, hard5, hard6, hard7, hard8, hard9, hard10, hard11, hard12 };
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField17 = new javax.swing.JTextField();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jComboBox14 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox<>();
        jComboBox16 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox17 = new javax.swing.JComboBox<>();
        jComboBox18 = new javax.swing.JComboBox<>();
        jComboBox19 = new javax.swing.JComboBox<>();
        jComboBox20 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox21 = new javax.swing.JComboBox<>();
        jComboBox22 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox23 = new javax.swing.JComboBox<>();
        jComboBox24 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setToolTipText("");
        jComboBox1.setName(""); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 57, 533, -1));
        jComboBox1.getAccessibleContext().setAccessibleName("");

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 114, 533, -1));

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 171, 533, -1));

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 234, 533, -1));

        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 297, 533, -1));

        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 360, 533, -1));

        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 423, 533, -1));

        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 486, 533, -1));

        jTextField1.setEditable(false);
        jTextField1.setText("Placa Video");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 29, 99, -1));

        jTextField2.setEditable(false);
        jTextField2.setText("Placa de Sunet");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 85, 99, -1));

        jTextField3.setEditable(false);
        jTextField3.setText("Procesor");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 142, 99, -1));

        jTextField4.setEditable(false);
        jTextField4.setText("Placa de Baza");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 205, 99, -1));

        jTextField5.setEditable(false);
        jTextField5.setText("Sursa");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 268, 99, -1));

        jTextField6.setEditable(false);
        jTextField6.setText("Carcasa");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 331, 99, -1));

        jTextField7.setEditable(false);
        jTextField7.setText("Memorie RAM");
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 394, 99, -1));

        jTextField8.setEditable(false);
        jTextField8.setText("Hard Disk");
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 457, 99, -1));

        jButton1.setText("Pretul Total");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 526, 100, -1));

        jTextField17.setEditable(false);
        getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 555, 156, 69));

        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 28, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setLabelFor(jComboBox3);
        jLabel1.setText("Componente selectate:");
        jLabel1.setToolTipText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 60, -1, -1));

        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 28, -1, -1));

        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox11ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 85, -1, -1));

        getContentPane().add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 85, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 117, -1, -1));

        getContentPane().add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 142, -1, -1));

        getContentPane().add(jComboBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 142, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 174, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 237, -1, -1));

        getContentPane().add(jComboBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 205, -1, -1));

        getContentPane().add(jComboBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 205, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 300, -1, -1));

        getContentPane().add(jComboBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 268, -1, -1));

        getContentPane().add(jComboBox18, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 268, -1, -1));

        jComboBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox19ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox19, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 394, -1, -1));

        getContentPane().add(jComboBox20, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 394, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 426, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 489, -1, -1));

        getContentPane().add(jComboBox21, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 457, -1, -1));

        getContentPane().add(jComboBox22, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 457, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 363, -1, -1));

        jComboBox23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox23ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        jComboBox24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox24ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox24, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        jButton2.setText("Elimina filtru");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 457, -1, -1));

        jButton3.setText("Elimina filtru");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 394, -1, -1));

        jButton4.setText("Elimina filtru");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 331, -1, -1));

        jButton5.setText("Elimina filtru");
        jButton5.setToolTipText("");
        jButton5.setActionCommand("");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 268, -1, -1));

        jButton6.setText("Elimina filtru");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 205, -1, -1));

        jButton7.setText("Elimina filtru");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 142, -1, -1));

        jButton8.setText("Elimina filtru");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 85, -1, -1));

        jButton9.setText("Elimina filtru");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 28, -1, -1));

        jTextField9.setEditable(false);
        jTextField9.setText("vRAM:");
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 28, 70, -1));

        jTextField10.setEditable(false);
        jTextField10.setText("Producator:");
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 28, -1, -1));

        jTextField11.setEditable(false);
        jTextField11.setText("DolbyAtmos");
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 85, -1, -1));

        jTextField12.setEditable(false);
        jTextField12.setText("Canale audio:");
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 85, -1, -1));

        jTextField13.setEditable(false);
        jTextField13.setText("Generatia:");
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 142, -1, -1));

        jTextField14.setEditable(false);
        jTextField14.setText("Producator:");
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 142, -1, -1));

        jTextField15.setEditable(false);
        jTextField15.setText("Porturi USB:");
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 205, -1, -1));

        jTextField16.setEditable(false);
        jTextField16.setText("Format memorie:");
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 205, -1, -1));

        jTextField18.setEditable(false);
        jTextField18.setText("Putere:");
        getContentPane().add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        jTextField19.setEditable(false);
        jTextField19.setText("Producator:");
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jTextField20.setEditable(false);
        jTextField20.setText("Dimensiune:");
        getContentPane().add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        jTextField21.setEditable(false);
        jTextField21.setText("Culoare:");
        getContentPane().add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        jTextField22.setEditable(false);
        jTextField22.setText("Tip memorie:");
        getContentPane().add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));

        jTextField23.setEditable(false);
        jTextField23.setText("Capacitate:");
        getContentPane().add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 394, -1, -1));

        jTextField24.setEditable(false);
        jTextField24.setText("RPM:");
        getContentPane().add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 457, -1, -1));

        jTextField25.setEditable(false);
        jTextField25.setText("Capacitate:");
        getContentPane().add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 457, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\diaco\\Desktop\\Desktop\\src\\main\\java\\proiect\\desktop\\interfata.png")); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 2540, 1240));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    jLabel2.setText(jComboBox1.getSelectedItem().toString());
        Object selectedItem9 = jComboBox9.getSelectedItem();
        Object selectedItem10 = jComboBox10.getSelectedItem();


        if (selectedItem9 != null && selectedItem10 != null
                && !selectedItem9.toString().equals("---") && !selectedItem10.toString().equals("---")) {


            String cond1 = selectedItem9.toString();
            int cond2 = Integer.parseInt(selectedItem10.toString());

            // 
            PlacaVideo[] PlacaVideoSortata = sort2ConditiiPlacaVideo(cond1, cond2);

            // 
            if (PlacaVideoSortata != null) {
                jComboBox1.removeAllItems();
                for (PlacaVideo placaVideo : PlacaVideoSortata) {
                    if (placaVideo != null) {
                        jComboBox1.addItem(placaVideo.toString());
                    }
                }
            }
            jComboBox9.setSelectedItem("---");
      jComboBox10.setSelectedItem("---");    
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
     public PlacaVideo[] sort2ConditiiPlacaVideo(String cond1, int cond2) {
        List<PlacaVideo> rezultatList = new ArrayList<>();

        for (PlacaVideo vectorPlacaVideo1 : vectorPlacaVideo) {
            if (vectorPlacaVideo1.getProducator().equals(cond1)  && cond2 == vectorPlacaVideo1.getVram()) {
                rezultatList.add(vectorPlacaVideo1);
            }
        }

        PlacaVideo[] rezultat = rezultatList.toArray(new PlacaVideo[0]);
        return rezultat;
    }
     
     
     
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
       jLabel3.setText(jComboBox2.getSelectedItem().toString());
    Object selectedItem13 = jComboBox11.getSelectedItem();
    Object selectedItem14 = jComboBox12.getSelectedItem();

    

if (selectedItem13 != null && selectedItem14 != null &&
    !selectedItem13.toString().equals("---") && !selectedItem14.toString().equals("---")) {

        // Converțiți valorile selectate la tipurile așteptate

        int cond1 = Integer.parseInt(selectedItem13.toString());
        boolean cond2 = Boolean.parseBoolean(selectedItem14.toString());

        // 
        PlacaDeSunet[] PlacaDeSunetSortata = sort2ConditiiPlacaSunet(cond1, cond2);

        // 
        if (PlacaDeSunetSortata != null) {
            jComboBox2.removeAllItems();
            for (PlacaDeSunet placaSunet : PlacaDeSunetSortata) {
                if (placaSunet != null) {
                    jComboBox2.addItem(placaSunet.toString());
                }
            }
        }
        jComboBox11.setSelectedItem("---");
      jComboBox12.setSelectedItem("---"); 
    }
    }//GEN-LAST:event_jComboBox2ActionPerformed
    
    public PlacaDeSunet[] sort2ConditiiPlacaSunet(Integer cond1, Boolean cond2) {
        List<PlacaDeSunet> rezultatList = new ArrayList<>();

        for (PlacaDeSunet vectorPlacaSunet1 : vectorPlacaDeSunet) {
             if (vectorPlacaSunet1.getCanaleAudio() == cond1 && cond2.equals(vectorPlacaSunet1.getSuportDolbyAtmos())) {
                rezultatList.add(vectorPlacaSunet1);
            }
        }
        PlacaDeSunet[] rezultat = rezultatList.toArray(new PlacaDeSunet[0]);
        return rezultat;
    }
    
    
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
      jLabel4.setText(jComboBox3.getSelectedItem().toString());
    Object selectedItem11 = jComboBox13.getSelectedItem();
    Object selectedItem12 = jComboBox14.getSelectedItem();
    
   
    if (selectedItem11 != null && selectedItem12 != null &&
        !selectedItem11.toString().equals("---") && !selectedItem12.toString().equals("---")) {

        // Converțiți valorile selectate la tipurile așteptate
        String cond1 = selectedItem11.toString();
        int cond2 = Integer.parseInt(selectedItem12.toString());

        // Apelați metoda sort2ConditiiRAM
        Procesor[] ProcesorSortat = sort2ConditiiProcesor(cond1, cond2);

        // Verificați dacă rezultatul nu este nul și adăugați elementele în jComboBox7
        if (ProcesorSortat != null) {
            jComboBox3.removeAllItems();
            for (Procesor procesor : ProcesorSortat) {
                if (procesor != null) {
                    jComboBox3.addItem(procesor.toString());
                }
            }
        } jComboBox13.setSelectedItem("---");
      jComboBox14.setSelectedItem("---");     
    }
    }//GEN-LAST:event_jComboBox3ActionPerformed
    
    public Procesor[] sort2ConditiiProcesor(String cond1, int cond2) {
    List<Procesor> rezultatList = new ArrayList<>();

    for (Procesor vectorProcesor1 : vectorProcesor) {
        if (vectorProcesor1.getProducator().equals(cond1) && cond2 == vectorProcesor1.getGeneratie()) {
            rezultatList.add(vectorProcesor1);
        }
    }
    Procesor[] rezultat = rezultatList.toArray(new Procesor[0]);
    return rezultat;
}
    
    
    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
      jLabel5.setText(jComboBox4.getSelectedItem().toString());
    Object selectedItem11 = jComboBox15.getSelectedItem();
    Object selectedItem12 = jComboBox16.getSelectedItem();
    
    
    if (selectedItem11 != null && selectedItem12 != null &&
        !selectedItem11.toString().equals("---") && !selectedItem12.toString().equals("---")) {

        // Converțiți valorile selectate la tipurile așteptate
        String cond1 = selectedItem11.toString();
        int cond2 = Integer.parseInt(selectedItem12.toString());

        // Apelați metoda sort2ConditiiRAM
        PlacaDeBaza[] PlacaDeBazaSortata = sort2ConditiiPlacaDeBaza(cond1, cond2);

        // Verificați dacă rezultatul nu este nul și adăugați elementele în jComboBox7
        if (PlacaDeBazaSortata != null) {
            jComboBox4.removeAllItems();
            for (PlacaDeBaza placaDeBaza : PlacaDeBazaSortata) {
                if (placaDeBaza != null) {
                    jComboBox4.addItem(placaDeBaza.toString());
                }
            }
        }   jComboBox15.setSelectedItem("---");
      jComboBox16.setSelectedItem("---");     
    }
    }//GEN-LAST:event_jComboBox4ActionPerformed
    
    public PlacaDeBaza[] sort2ConditiiPlacaDeBaza(String cond1, int cond2) {
    List<PlacaDeBaza> rezultatList = new ArrayList<>();

    for (PlacaDeBaza vectorPlacaDeBaza1 : vectorPlacaDeBaza) {
        if (vectorPlacaDeBaza1.getTipMemorie().equals(cond1) && cond2 == vectorPlacaDeBaza1.getPorturiUSB()) {
            rezultatList.add(vectorPlacaDeBaza1);
        }
    }
    PlacaDeBaza[] rezultat = rezultatList.toArray(new PlacaDeBaza[0]);
    return rezultat;
}

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
      jLabel6.setText(jComboBox5.getSelectedItem().toString());
    Object selectedItem11 = jComboBox17.getSelectedItem();
    Object selectedItem12 = jComboBox18.getSelectedItem();
    
    
    if (selectedItem11 != null && selectedItem12 != null &&
        !selectedItem11.toString().equals("---") && !selectedItem12.toString().equals("---")) {

        // Converțiți valorile selectate la tipurile așteptate
        String cond1 = selectedItem11.toString();
        int cond2 = Integer.parseInt(selectedItem12.toString());

        // Apelați metoda sort2ConditiiRAM
        Sursa[] SursaSortata = sort2conditiiSursa(cond1, cond2);

        // Verificați dacă rezultatul nu este nul și adăugați elementele în jComboBox7
        if (SursaSortata != null) {
            jComboBox5.removeAllItems();
            for (Sursa sursa : SursaSortata) {
                if (sursa != null) {
                    jComboBox5.addItem(sursa.toString());
                }
            }
        } jComboBox17.setSelectedItem("---");
      jComboBox18.setSelectedItem("---");  
    }
    }//GEN-LAST:event_jComboBox5ActionPerformed
    
    public Sursa[] sort2conditiiSursa(String cond1, int cond2) {
    List<Sursa> rezultatList = new ArrayList<>();

    for (Sursa vectorSursa1 : vectorSursa) {
        if (vectorSursa1.getProducator().equals(cond1) && cond2 == vectorSursa1.getPutere()) {
            rezultatList.add(vectorSursa1);
        }
    }
    Sursa[] rezultat = rezultatList.toArray(new Sursa[0]);
    return rezultat;
}
    
    
    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
      jLabel9.setText(jComboBox6.getSelectedItem().toString());
    Object selectedItem11 = jComboBox23.getSelectedItem();
    Object selectedItem12 = jComboBox24.getSelectedItem();
    
    
    if (selectedItem11 != null && selectedItem12 != null &&
        !selectedItem11.toString().equals("---") && !selectedItem12.toString().equals("---")) {

        // Converțiți valorile selectate la tipurile așteptate
        String cond1 = selectedItem11.toString();
        String cond2 = selectedItem12.toString();


        // Apelați metoda sort2ConditiiRAM
        Carcasa[] carcasaSortata = sort2ConditiiCarcasa(cond1, cond2);

        // Verificați dacă rezultatul nu este nul și adăugați elementele în jComboBox7
        if (carcasaSortata != null) {
            jComboBox6.removeAllItems();
            for (Carcasa c1 : carcasaSortata) {
                if (c1 != null) {
                    jComboBox6.addItem(c1.toString());
                }
            }
        } jComboBox23.setSelectedItem("---");
      jComboBox24.setSelectedItem("---");  
    }
    }//GEN-LAST:event_jComboBox6ActionPerformed
    
    public Carcasa[] sort2ConditiiCarcasa(String cond1, String cond2)
{List <Carcasa> rezultatList=new ArrayList<>();
for(Carcasa c:vectorCarcasa)
{
if (cond1.equals(c.getCuloare()) && cond2.equals(c.getDimensiuni())){
rezultatList.add(c);
}}
Carcasa[] rezultat=rezultatList.toArray(new Carcasa[0]);
return rezultat;
}
    
    
    
    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
      jLabel7.setText(jComboBox7.getSelectedItem().toString());
             
    Object selectedItem11 = jComboBox19.getSelectedItem();
    Object selectedItem12 = jComboBox20.getSelectedItem();
    

    if (selectedItem11 != null && selectedItem12 != null &&
        !selectedItem11.toString().equals("---") && !selectedItem12.toString().equals("---")) {

     
        int cond1 = Integer.parseInt(selectedItem11.toString());
        String cond2 = selectedItem12.toString();

     
        MemorieRAM[] memorieSortata = sort2ConditiiRAM(cond1, cond2);

      
        if (memorieSortata != null) {
            jComboBox7.removeAllItems();
            for (MemorieRAM memorie1 : memorieSortata) {
                if (memorie1 != null) {
                    jComboBox7.addItem(memorie1.toString());
                }
            }
        } jComboBox19.setSelectedItem("---");
      jComboBox20.setSelectedItem("---");    }
    }//GEN-LAST:event_jComboBox7ActionPerformed
    
     public MemorieRAM[] sort2ConditiiRAM(int cond1, String cond2) {
    List<MemorieRAM> rezultatList = new ArrayList<>();

    for (MemorieRAM vectorMemorieRAM1 : vectorMemorieRAM) {
        if (cond1 == vectorMemorieRAM1.getCapacitate() && vectorMemorieRAM1.getTipMemorie().equals(cond2)) {
            rezultatList.add(vectorMemorieRAM1);
        }
    } 
    MemorieRAM[] rezultat = rezultatList.toArray(new MemorieRAM[0]);
    return rezultat;
    }
     
     
    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
   jLabel8.setText(jComboBox8.getSelectedItem().toString());
       
       Object selectedItem13 = jComboBox21.getSelectedItem();
Object selectedItem14 = jComboBox22.getSelectedItem();


  if (selectedItem13 != null && selectedItem14 != null &&   !selectedItem13.toString().equals("---") &&
          !selectedItem14.toString().equals("---")) 
  {
      int cond1=Integer.parseInt(selectedItem13.toString());
      int cond2=Integer.parseInt(selectedItem14.toString());
      HardDisk[] hardSortat=sort2ConditiiHard(cond1, cond2);
      if (hardSortat!=null)
      {
      jComboBox8.removeAllItems();
      for(HardDisk h1:hardSortat)
      {
      if (h1!=null)
      {
      jComboBox8.addItem(h1.toString());  }}}
      jComboBox22.setSelectedItem("---");
      jComboBox21.setSelectedItem("---");
  }
    }//GEN-LAST:event_jComboBox8ActionPerformed
    
    
    public HardDisk[] sort2ConditiiHard(int cond1, int cond2)
    { List<HardDisk> rezultatList= new ArrayList<>();
        for (HardDisk hard1:vectorHardDisk)
        {
        if(cond1==hard1.getCapacitate() && cond2==hard1.getViteza())
        {
        rezultatList.add(hard1);
        }}
        
        HardDisk[] rezultat=rezultatList.toArray(new HardDisk[0]);
        return rezultat;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String selectedPlacaVideo = jComboBox1.getSelectedItem().toString();
    String selectedPlacaSunet = jComboBox2.getSelectedItem().toString();
    String selectedProcesor = jComboBox3.getSelectedItem().toString();
    String selectedPlacaBaza = jComboBox4.getSelectedItem().toString();
    String selectedSursa = jComboBox5.getSelectedItem().toString();
    String selectedCarcasa = jComboBox6.getSelectedItem().toString();
    String selectedMemorieRAM = jComboBox7.getSelectedItem().toString();
    String selectedHardDisk = jComboBox8.getSelectedItem().toString();

        PlacaVideo selectedPlacaVideoObject = null;
        for (PlacaVideo placavideo : vectorPlacaVideo) {
            if (placavideo.toString().equals(selectedPlacaVideo)) {
                selectedPlacaVideoObject = placavideo;
                break;
            }
        }

        PlacaDeSunet selectedPlacaSunetObject = null;
        for (PlacaDeSunet placaSunet : vectorPlacaDeSunet) {
            if (placaSunet.toString().equals(selectedPlacaSunet)) {
                selectedPlacaSunetObject = placaSunet;
                break;
            }
        }

        Procesor selectedProcesorObject = null;
        for (Procesor procesor : vectorProcesor) {
            if (procesor.toString().equals(selectedProcesor)) {
                selectedProcesorObject = procesor;
                break;
            }
        }

        PlacaDeBaza selectedPlacadeBazaObject = null;
        for (PlacaDeBaza placaBaza : vectorPlacaDeBaza) {
            if (placaBaza.toString().equals(selectedPlacaBaza)) {
                selectedPlacadeBazaObject = placaBaza;
                break;
            }
        }

        Sursa selectedSursaObject = null;
        for (Sursa sursa : vectorSursa) {
            if (sursa.toString().equals(selectedSursa)) {
                selectedSursaObject = sursa;
                break;
            }
        }

        Carcasa selectedCarcasaObject = null;
        for (Carcasa carcasa : vectorCarcasa) {
            if (carcasa.toString().equals(selectedCarcasa)) {
                selectedCarcasaObject = carcasa;
                break;
            }
        }

        MemorieRAM selectedMemorieRAMObject = null;
        for (MemorieRAM memorieRAM : vectorMemorieRAM) {
            if (memorieRAM.toString().equals(selectedMemorieRAM)) {
                selectedMemorieRAMObject = memorieRAM;
                break;
            }
        }

        HardDisk selectedHardDiskObject = null;
        for (HardDisk hardDisk : vectorHardDisk) {
            if (hardDisk.toString().equals(selectedHardDisk)) {
                selectedHardDiskObject = hardDisk;
                break;
            }
        }

    double totalPrice = 0;
    if (selectedPlacaVideoObject != null) {
        totalPrice += selectedPlacaVideoObject.getPret();
    }
    if (selectedPlacaSunetObject != null) {
        totalPrice += selectedPlacaSunetObject.getPret();
    }
    if (selectedProcesorObject != null) {
        totalPrice += selectedProcesorObject.getPret();
    }
    if (selectedPlacadeBazaObject != null) {
        totalPrice += selectedPlacadeBazaObject.getPret();
    }
    if (selectedSursaObject != null) {
        totalPrice += selectedSursaObject.getPret();
    }
    if (selectedCarcasaObject != null) {
        totalPrice += selectedCarcasaObject.getPret();
    }
    if (selectedMemorieRAMObject != null) {
        totalPrice += selectedMemorieRAMObject.getPret();
    }
        if (selectedHardDiskObject != null) {
        totalPrice += selectedHardDiskObject.getPret();
    }
    jTextField17.setText(String.valueOf(totalPrice)+" RON");

    }//GEN-LAST:event_jButton1ActionPerformed

    
   
    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
      
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultComboBoxModel<String> emptyModel = new DefaultComboBoxModel<>();
            jComboBox8.setModel(emptyModel);
         jComboBox8.addItem("---");
        for(HardDisk hardDisk : vectorHardDisk){
            jComboBox8.addItem(hardDisk.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultComboBoxModel<String> emptyModel = new DefaultComboBoxModel<>();
            jComboBox7.setModel(emptyModel);
            jComboBox7.addItem("---");
        for(MemorieRAM r:vectorMemorieRAM){
            jComboBox7.addItem(r.toString());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox19ActionPerformed

    private void jComboBox23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox23ActionPerformed

    private void jComboBox24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox24ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        DefaultComboBoxModel<String> emptyModel = new DefaultComboBoxModel<>();
        jComboBox6.setModel(emptyModel);
        jComboBox6.addItem("---");
        for(Carcasa carcasa : vectorCarcasa){
        jComboBox6.addItem(carcasa.toString());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       DefaultComboBoxModel<String> emptyModel = new DefaultComboBoxModel<>();
            jComboBox5.setModel(emptyModel);
            jComboBox5.addItem("---");
        for(Sursa s:vectorSursa){
            jComboBox5.addItem(s.toString());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       DefaultComboBoxModel<String> emptyModel = new DefaultComboBoxModel<>();
            jComboBox4.setModel(emptyModel);
            jComboBox4.addItem("---");
        for(PlacaDeBaza b:vectorPlacaDeBaza){
            jComboBox4.addItem(b.toString());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       DefaultComboBoxModel<String> emptyModel = new DefaultComboBoxModel<>();
            jComboBox3.setModel(emptyModel);
            jComboBox3.addItem("---");
        for(Procesor p:vectorProcesor){
            jComboBox3.addItem(p.toString());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       DefaultComboBoxModel<String> emptyModel = new DefaultComboBoxModel<>();
            jComboBox2.setModel(emptyModel);
            jComboBox2.addItem("---");
        for(PlacaDeSunet ps:vectorPlacaDeSunet){
            jComboBox2.addItem(ps.toString());
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         DefaultComboBoxModel<String> emptyModel = new DefaultComboBoxModel<>();
            jComboBox1.setModel(emptyModel);
            jComboBox1.addItem("---");
        for(PlacaVideo pv:vectorPlacaVideo){
            jComboBox1.addItem(pv.toString());
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jComboBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox11ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfataDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfataDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfataDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfataDesktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
  
      
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfataDesktop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox20;
    private javax.swing.JComboBox<String> jComboBox21;
    private javax.swing.JComboBox<String> jComboBox22;
    private javax.swing.JComboBox<String> jComboBox23;
    private javax.swing.JComboBox<String> jComboBox24;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
