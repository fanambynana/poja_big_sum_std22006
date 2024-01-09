package com.poja_big_sum_std22006.base.repository;

import com.poja_big_sum_std22006.base.PojaGenerated;
import com.poja_big_sum_std22006.base.repository.model.DummyUuid;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@PojaGenerated
@Repository
public interface DummyUuidRepository extends JpaRepository<DummyUuid, String> {

  @Override
  Optional<DummyUuid> findById(String id);
}
