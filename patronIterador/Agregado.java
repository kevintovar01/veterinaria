package patronIterador;

public abstract class Agregado<T> {
	public abstract Iterador<T> getIterador();
	public abstract int size();
	public abstract T get(int index);
	public abstract void add(T object);
	public abstract void remove(T object);
}