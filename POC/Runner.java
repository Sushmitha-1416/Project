class Runner{
	
    public static void main(String[] args){
		
        Wardrobe wardrobe=new Wardrobe();
        String mate= wardrobe.material;
        System.out.println("Material="+mate);
        mate= "TEAK";
        System.out.println( "Updated Material="+mate);
        double cost= wardrobe.price;
        System.out.println("Material="+cost);
        cost= 50000;
        System.out.println( "Updated Material="+cost);
        System.out.println("--------------------------------------");
		
        Atm atm=new Atm();
        String card= atm.cardType;
        System.out.println("cardType="+card);
        card= "Debit Card";
        System.out.println( "Updated cardType="+card);
        double amount=atm.amountToDebited;
        System.out.println("amountToDebited="+amount);
        amount=6000;
        System.out.println( "Updated amountToDebited="+amount);
        System.out.println("--------------------------------------");
		
        Coin coin=new Coin();
        String toss= coin.tossing;
        System.out.println("Toss="+toss);
        toss= "Head";
        System.out.println( "Updated Toss="+card);
        String toss1= coin.tossing;
        System.out.println("Toss="+toss1);
        toss1= "Tail";
        System.out.println( "Updated Material="+toss1);
        System.out.println("--------------------------------------");
		
        Furniture furniture=new Furniture();
        String color= furniture.colour;
        System.out.println("color="+color);
        color= "RED";
        System.out.println( "Updated color="+color);
        String types= furniture.type;
        System.out.println("type="+types);
        types= "Chair";
        System.out.println( "Updated type="+types);
        System.out.println("--------------------------------------");
		
        Aeroplane aeroplane=new Aeroplane();
        String comp= aeroplane.company;
        System.out.println("color="+comp);
        comp= "AIR INDIA";
        System.out.println( "Updated color="+comp);
        String atypes= aeroplane.type;
        System.out.println("type="+types);
        atypes= "PRIVATE JET";
        System.out.println( "Updated type="+types);
        System.out.println("--------------------------------------");
		
        Cctv cctv=new Cctv();
        int qual=cctv.qualityInMp;
        System.out.println("QualityInMp="+qual);
        qual= 2;
        System.out.println( "Updated QualityInMp="+qual);
        String cables= cctv.cable;
        System.out.println("type="+cables);
        cables= "PlayCable";
        System.out.println( "Updated type="+cables);
        System.out.println("--------------------------------------");
		
        Tripod tripod=new Tripod();
        String tbrand=tripod.brand;
        System.out.println("Tripod brand"+tbrand);
        tbrand= "syvo";
        System.out.println( "Updated QualityInMp="+tbrand);
        String frames= tripod.frame;
        System.out.println("type="+frames);
        frames= "Aluminium";
        System.out.println( "Updated type="+frames);
        System.out.println("--------------------------------------");
		
        Zip zip=new Zip();
        double size=zip.sliderSizeInMm;
        System.out.println("Tripod brand"+size);
        size= 10;
        System.out.println( "Updated Tripod brand="+size);
        String colori= zip.tapeColor;
        System.out.println("type="+colori);
        colori= "black";
        System.out.println( "Updated type="+colori);
        System.out.println("--------------------------------------");
		
        Helmet helmet=new Helmet();
        String siz=helmet.size;
        System.out.println("Tripod brand"+siz);
        siz= "Medium";
        System.out.println( "Updated Tripod brand="+siz);
        String brands=helmet.brand;
        System.out.println("type="+color);
        brands= "vega";
        System.out.println( "Updated type="+color);
        System.out.println("--------------------------------------");
		
        Hillstation hillstation=new Hillstation();
        double heigh=hillstation.heightInFt;
        System.out.println("Tripod brand"+heigh);
        heigh=4488;
        System.out.println( "Updated Tripod brand="+heigh);
        String hillNames=hillstation.hillName;
        System.out.println("type="+hillNames);
        hillNames= "Shivagange";
        System.out.println( "Updated type="+hillNames);
        System.out.println("--------------------------------------");
		
        Camera camera=new Camera();
        int pix=camera.pixel;
        System.out.println("QualityInMp="+pix);
        pix= 2;
        System.out.println( "Updated QualityInMp="+pix);
        String cam= camera.company;
        System.out.println("type="+cam);
        cam= "Sony";
        System.out.println( "Updated type="+cam);
        System.out.println("--------------------------------------");
		
        Hat hat=new Hat();
        String col=hat.color;
        System.out.println("QualityInMp="+col);
        col= "black";
        System.out.println( "Updated QualityInMp="+col);
        String qua= hat.materialQuality;
        System.out.println("type="+qua);
        qua= "Sony";
        System.out.println( "Updated type="+qua);
        System.out.println("--------------------------------------");
		
        SelfieStick selfieStick=new SelfieStick();
        String typ=selfieStick.type;
        System.out.println("Type="+typ);
        typ= "monopod";
        System.out.println( "Updated Type="+typ);
        double lengt= selfieStick.lengthInCm;
        System.out.println("lengthinCm="+lengt);
        lengt= 20;
        System.out.println( "Updated lengthinCm="+lengt);
        System.out.println("--------------------------------------");
		
        Cloth cloth=new Cloth();
        String ctyp=cloth.type;
        System.out.println("Type="+typ);
        ctyp= "Silk";
        System.out.println( "Updated Type="+typ);
        String bran= cloth.brand;
        System.out.println("Brand="+bran);
        bran= "Fabindia";
        System.out.println( "Updated Brand="+bran);
        System.out.println("--------------------------------------");
		
        Poster poster =new Poster();
        String lay=poster.layout;
        System.out.println("Layout="+lay);
        lay= "FixedPosition";
        System.out.println( "Updated Layout="+lay);
        String shap= poster.shape;
        System.out.println("Shape="+shap);
        shap= "Rectange";
        System.out.println( "Updated Shape="+shap);
        System.out.println("--------------------------------------");
		
        PostBox postBox =new PostBox();
        String letter=postBox.letterType;
        System.out.println("Layout="+letter);
        letter= "PersonalLetter";
        System.out.println( "Updated Layout="+letter);
        String made= postBox.madeUpOf;
        System.out.println("Shape="+made);
        made= "castIron";
        System.out.println( "Updated Shape="+made);
        System.out.println("--------------------------------------");
		
        Key key=new Key();
        String mat=key.material;
        System.out.println("material="+mat);
        mat= "metal";
        System.out.println( "Updated material="+mat);
        double cod= key.code;
        System.out.println("code="+cod);
        cod= 8;
        System.out.println( "Updated code="+cod);
        System.out.println("--------------------------------------");
		
        Tree tree=new Tree();
        String tre=tree.treeName;
        System.out.println("treeName="+tre);
        tre= "Baniyan tree";
        System.out.println( "Updated treeName="+tre);
        double heighs= tree.heightInM;
        System.out.println("Height="+heighs);
        heighs= 8;
        System.out.println( "Updated height="+heighs);
		
	}
}




