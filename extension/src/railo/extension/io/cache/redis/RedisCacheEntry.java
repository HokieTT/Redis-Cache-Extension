package railo.extension.io.cache.redis;

import railo.commons.io.cache.CacheEntry;
import railo.extension.util.Functions;
import railo.runtime.exp.PageException;
import railo.runtime.type.Struct;

import java.util.Date;

public class RedisCacheEntry implements CacheEntry{

    RedisCacheItem item;
    Functions func = new Functions();
    
    public RedisCacheEntry(RedisCacheItem redisCacheItem) {
        item = redisCacheItem;
    }

    public Date lastHit() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Date lastModified() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Date created() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public int hitCount() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String getKey() {
        return item.getKey();
    }

    public Object getValue() {
        try {
            return func.evaluate(item.getValue());
        } catch (PageException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            return null;
        }
    }

    public long size() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public long liveTimeSpan() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public long idleTimeSpan() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Struct getCustomInfo() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
