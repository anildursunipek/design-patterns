package abstractfactory;
import abstractfactory.Instance;
public interface ResourceFactory {
    public Instance createInstance(Instance.Capacity capacity);
    public Storage createStorage(int capMib);
}
