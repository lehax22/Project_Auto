package services;

import dao.FollowsDaoImpl;
import dao.interf.FollowsDao;
import entity.Follows;
import services.interf.FollowsService;

import java.util.ArrayList;

/**
 * Created by Alex on 21.11.2016.
 */
public class FollowsServiceImpl implements FollowsService{

    private FollowsDao followsDao = new FollowsDaoImpl();

    @Override
    public ArrayList<Follows> getListFollows(Integer id) {
        ArrayList<Follows> followses = followsDao.getListFollows(id);
        if (followses != null) {
            return followses;
        }
        return null;
    }

    @Override
    public ArrayList<Follows> getListSubFollows(Integer id) {
        ArrayList<Follows> followses = followsDao.getListSubFollows(id);
        if (followses != null) {
            return followses;
        }
        return null;
    }

    @Override
    public void delSub(String sub, String user) {
        followsDao.delSub(sub, user);
    }

    @Override
    public void unfollow(Integer id, Integer follow) {
        followsDao.unfollow(id, follow);
    }
}
