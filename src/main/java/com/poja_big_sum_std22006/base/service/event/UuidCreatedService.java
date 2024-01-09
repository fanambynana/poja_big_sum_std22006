package com.poja_big_sum_std22006.base.service.event;

import com.poja_big_sum_std22006.base.PojaGenerated;
import com.poja_big_sum_std22006.base.endpoint.event.gen.UuidCreated;
import com.poja_big_sum_std22006.base.repository.DummyUuidRepository;
import com.poja_big_sum_std22006.base.repository.model.DummyUuid;
import java.util.function.Consumer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@PojaGenerated
@Service
@AllArgsConstructor
@Slf4j
public class UuidCreatedService implements Consumer<UuidCreated> {

  private final DummyUuidRepository dummyUuidRepository;

  @Override
  public void accept(UuidCreated uuidCreated) {
    var dummyUuid = new DummyUuid();
    dummyUuid.setId(uuidCreated.getUuid());
    dummyUuidRepository.save(dummyUuid);
  }
}
