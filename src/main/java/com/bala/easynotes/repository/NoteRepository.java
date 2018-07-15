package com.bala.easynotes.repository;

import com.bala.easynotes.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bala on 15/07/18.
 */

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
