package javax.persistence.async;

import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.Parameter;
import javax.persistence.TemporalType;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

/**
 * Asynchronous version of {@link javax.persistence.TypedQuery}.
 *
 * @author Jakob Korherr
 */
public interface AsyncQuery<ResultType> {

    CompletableFuture<List<ResultType>> getResultList();

    CompletableFuture<ResultType> getSingleResult();

    CompletableFuture<Integer> executeUpdate();

    AsyncQuery<ResultType> setMaxResults(int maxResult);

    int getMaxResults();

    AsyncQuery<ResultType> setFirstResult(int startPosition);

    int getFirstResult();

    AsyncQuery<ResultType> setHint(String hintName, Object value);

    Map<String, Object> getHints();

    <T> AsyncQuery<ResultType> setParameter(Parameter<T> param, T value);

    AsyncQuery<ResultType> setParameter(Parameter<Calendar> param,
                                        Calendar value,
                                        TemporalType temporalType);

    AsyncQuery<ResultType> setParameter(Parameter<Date> param,
                                        Date value,
                                        TemporalType temporalType);

    AsyncQuery<ResultType> setParameter(String name, Object value);


    AsyncQuery<ResultType> setParameter(String name, Calendar value,
                                        TemporalType temporalType);

    AsyncQuery<ResultType> setParameter(String name, Date value,
                                        TemporalType temporalType);

    AsyncQuery<ResultType> setParameter(int position, Object value);

    AsyncQuery<ResultType> setParameter(int position, Calendar value,
                                        TemporalType temporalType);

    AsyncQuery<ResultType> setParameter(int position, Date value,
                                        TemporalType temporalType);

    Set<Parameter<?>> getParameters();

    Parameter<?> getParameter(String name);

    <T> Parameter<T> getParameter(String name, Class<T> type);

    Parameter<?> getParameter(int position);

    <T> Parameter<T> getParameter(int position, Class<T> type);

    boolean isBound(Parameter<?> param);

    <T> T getParameterValue(Parameter<T> param);

    Object getParameterValue(String name);

    Object getParameterValue(int position);

    AsyncQuery<ResultType> setFlushMode(FlushModeType flushMode);

    FlushModeType getFlushMode();

    AsyncQuery<ResultType> setLockMode(LockModeType lockMode);

    LockModeType getLockMode();

}
