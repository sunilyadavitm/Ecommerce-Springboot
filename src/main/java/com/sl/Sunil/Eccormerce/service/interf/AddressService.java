package com.sl.Sunil.Eccormerce.service.interf;

import com.sl.Sunil.Eccormerce.dto.AddressDto;
import com.sl.Sunil.Eccormerce.dto.Response;

public interface AddressService {
    Response saveAndUpdateAddress(AddressDto addressDto);
}
