package itsdefault.pack;

interface PlanesFactory {
    Plane1 createPlane1();
    Plane2 createPlane2();
}

class Plane1Factory implements PlanesFactory {
    @Override
    public Plane1 createPlane1()
    {
        return new  PlaneCorpuse1();
    }

    @Override
    public Plane2 createPlane2()
    {
        return new PlaneCorpuse2();
    }
}

class Plane2Factory implements PlanesFactory {
    @Override
    public Plane1 createPlane1()
    {
        return new PlaneCorpuse3();
    }

    @Override
    public Plane2 createPlane2()
    {
        return new PlaneCorpuse4();
    }
}
class PlaneCorpuse1 extends Plane1{
    public PlaneCorpuse1()
    {
        System.out.println("Plane 1 with engine 1");
    }
}

class PlaneCorpuse2 extends Plane2{
    public PlaneCorpuse2()
    {
        System.out.println("Plane 2 with engine 1");
    }
}

class PlaneCorpuse3 extends Plane1{
    public PlaneCorpuse3 ()
    {
        System.out.println("Plane 1 with engine 2");
    }
}

class PlaneCorpuse4 extends Plane2{
    public PlaneCorpuse4()
    {
        System.out.println("Plane 2 with engine 2");
    }
}

public class Main {

    public static void main(String[] args) {

        PlanesFactory fac;
        fac = new Plane1Factory();
        fac.createPlane1();
        fac.createPlane2();
        fac.createPlane1();
        fac.createPlane2();
    }
}
