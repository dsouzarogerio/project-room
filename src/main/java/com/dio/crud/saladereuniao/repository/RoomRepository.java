package com.dio.crud.saladereuniao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.crud.saladereuniao.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{

}
