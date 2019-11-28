package com.leg.blog.plus.business.tests;

import com.leg.blog.plus.business.dto.params.ProfileParam;
import com.leg.blog.plus.commons.utils.MapperUtils;
import org.junit.Test;

public class PrintJsonTests {

    @Test
    public void testPrintProfileParam() throws Exception {
        System.out.println(MapperUtils.obj2json(new ProfileParam()));
    }

}
