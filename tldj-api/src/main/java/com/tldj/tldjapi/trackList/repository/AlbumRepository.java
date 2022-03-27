package com.tldj.tldjapi.trackList.repository;

import com.tldj.tldjapi.trackList.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {

}
