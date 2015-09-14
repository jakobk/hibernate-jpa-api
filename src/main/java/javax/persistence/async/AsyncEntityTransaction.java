package javax.persistence.async;

import java.util.concurrent.CompletableFuture;

/**
 * TODO
 *
 * @author Jakob Korherr
 */
public interface AsyncEntityTransaction extends AsyncEntityOperations {

    public CompletableFuture<Void> commit();

    public CompletableFuture<Void> rollback();

    public void setRollbackOnly();

    public boolean getRollbackOnly();

    public boolean isActive();

}
