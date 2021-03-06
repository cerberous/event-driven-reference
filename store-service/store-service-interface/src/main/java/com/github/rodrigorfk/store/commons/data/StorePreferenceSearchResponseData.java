package com.github.rodrigorfk.store.commons.data;

import lombok.Builder;
import lombok.Data;

/**
 * @author Rodrigo Fior Kuntzer <rodrigo.kuntzer@cwi.com.br>
 */
@Data
@Builder
public class StorePreferenceSearchResponseData {

    private String ticker;
    private StorePreferenceData storePreference;
}
