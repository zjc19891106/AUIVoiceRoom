package io.agora.uikit.bean.domain;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ProcessMicSeatPayloadDomain {
    private String desc;
    private Integer seatNo;
}
