package org.codej.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SampleHotel {
	

	private  Chef chef;

}
