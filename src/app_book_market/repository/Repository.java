package app_book_market.repository;

import java.sql.Connection;

public abstract class Repository<E> {
    public void save(E entity){
        final Connection connection = newConnection();
        doSave(connection, entity);
    }

    private void doSave(Connection connection, E entity) {

    }

    protected abstract Connection newConnection();
}
