package javax.persistence.async;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

/**
 * Asynchronous, simplified version of {@link javax.persistence.EntityManager}.
 *
 * @author Jakob Korherr
 */
public interface AsyncEntityManager extends AsyncEntityOperations {

    public <A> CompletableFuture<A> inTransaction(Function<AsyncEntityTransaction, CompletableFuture<A>> txFunction);

    public void close();

}
