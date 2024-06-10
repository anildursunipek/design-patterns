package abstractfactory;

import abstractfactory.aws.AwsResourceFactory;
import abstractfactory.gcp.GcpResourceFactory;

public class Client {
    private ResourceFactory factory;

    public Client(ResourceFactory factory){
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity capacity, int capMib){
        Instance instance = this.factory.createInstance(capacity);
        Storage storage = this.factory.createStorage(capMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        // AWS Example
        Client client = new Client(new AwsResourceFactory());
        Instance i1 = client.createServer(Instance.Capacity.micro, 4096);
        i1.start();
        i1.stop();

        // GCP Example
        Client client2 = new Client(new GcpResourceFactory());
        Instance i2 = client2.createServer(Instance.Capacity.large, 2048);
        i2.start();
        i2.stop();
    }
}
