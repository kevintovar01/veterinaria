package patronIterador;

public abstract class Iterador<T> {
	public abstract boolean hasNext();
	public abstract Object next();
}