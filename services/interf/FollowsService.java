package services.interf;

import entity.Follows;

import java.util.ArrayList;

/**
 * Created by Alex on 21.11.2016.
 */
public interface FollowsService {

    ArrayList<Follows> getListFollows(Integer id);

    ArrayList<Follows> getListSubFollows(Integer id);

    void delSub(String sub, String user);

    void unfollow(Integer id, Integer follow);
}
