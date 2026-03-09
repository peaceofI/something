package com.study.barakahfocus.data.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.study.barakahfocus.data.local.entities.Reward;
import java.util.List;

@Dao
public interface RewardDao {
    @Insert
    void insert(Reward reward);

    @Query("SELECT * FROM reward")
    List<Reward> getAll();

    @Query("DELETE FROM reward WHERE id = :id")
    void deleteById(int id);
}
