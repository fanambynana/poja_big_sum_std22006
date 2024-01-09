package com.poja_big_sum_std22006.base.repository;

import com.poja_big_sum_std22006.base.PojaGenerated;
import com.poja_big_sum_std22006.base.repository.model.Dummy;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@PojaGenerated
@Repository
public interface DummyRepository extends JpaRepository<Dummy, String> {

  @Override
  List<Dummy> findAll();
}
