package com.tldj.tldjapi.trackList.repository;

import com.tldj.tldjapi.trackList.entity.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepository extends JpaRepository<Track, Long> {



}
