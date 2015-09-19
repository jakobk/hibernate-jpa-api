package javax.persistence.async;

/**
 * Asynchronous version of {@link javax.persistence.EntityTransaction}.
 *
 * @author Jakob Korherr
 */
public interface AsyncEntityTransaction extends AsyncEntityOperations {

    public void setRollbackOnly();
    public boolean getRollbackOnly();
    public boolean isActive();

}
