package com.pluralsight.repository;

import com.pluralsight.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 04/07/2016.
 */
@Repository("exerciseRepository")
public interface ExerciseRepository extends JpaRepository<Exercise,Long> {


}
