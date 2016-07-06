package com.pluralsight.repository;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

import java.util.List;

/**
 * Created by admin on 04/07/2016.
 */
public interface GoalRepository {

    Goal save(Goal goal);

    List<Goal> loadAll();

    List<GoalReport> findAllGoalReports();
}
