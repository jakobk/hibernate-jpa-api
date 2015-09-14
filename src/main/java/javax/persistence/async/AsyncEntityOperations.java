package javax.persistence.async;

import java.util.concurrent.CompletableFuture;

/**
 * TODO
 *
 * @author Jakob Korherr
 */
public interface AsyncEntityOperations {

    // TODO more operations

    public void persist();

    public CompletableFuture<Void> flush();

    public <T> AsyncQuery<T> createQuery(String qlString, Class<T> resultClass);

}
