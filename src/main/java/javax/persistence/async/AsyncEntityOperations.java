package javax.persistence.async;

/**
 * Interface combining (asynchronous) operations affecting entities.
 *
 * @author Jakob Korherr
 */
public interface AsyncEntityOperations {

    // TODO support more operations
    //public void persist();
    //public CompletableFuture<Void> flush();

    public <T> AsyncQuery<T> createQuery(String qlString, Class<T> resultClass);

}
