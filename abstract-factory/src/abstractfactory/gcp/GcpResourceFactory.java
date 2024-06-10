package abstractfactory.gcp;

import abstractfactory.Instance;
import abstractfactory.ResourceFactory;
import abstractfactory.Storage;

public class GcpResourceFactory implements ResourceFactory{
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
}
