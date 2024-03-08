package com.khmaies.msccbeerservice.web.mappers;

import com.khmaies.msccbeerservice.domain.Beer;
import com.khmaies.msccbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto beerDto);
}
