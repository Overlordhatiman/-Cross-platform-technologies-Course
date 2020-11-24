package itsdefault.pack;

interface IClient {
    public double add(double a);

    public double sub(double a);

    public double show();
}

class Client implements IClient{
    double money = 1000;

    @Override
    public double add(double a) {
        money += a;
        return money;
    }

    @Override
    public double sub(double a) {
        money -= a;
        return money;
    }

    @Override
    public double show() {
        return money;
    }
}

class Check implements IClient
{
    private Client client;

    @Override
    public double add(double a) {
        lazyInitClient();
        return client.add(a);
    }

    @Override
    public double sub(double a) {
        lazyInitClient();
        return client.sub(a);
    }

    @Override
    public double show() {
        return client.show();
    }

    private void lazyInitClient() {
        if (client == null) {
            client = new Client();
        }
    }
}

public class Main {

    public static void main(String[] args) {
        IClient obj = new Check();

        System.out.println(obj.add(100));
        System.out.println(obj.sub(10));
    }
}
