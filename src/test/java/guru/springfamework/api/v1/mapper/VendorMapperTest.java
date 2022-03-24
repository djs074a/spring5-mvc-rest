package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.VendorDTO;
import guru.springfamework.domain.Vendor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VendorMapperTest {

    public static final String VENDOR_NAME = "The Grocer";
    public static final long ID = 1L;

    VendorMapper vendorMapper = VendorMapper.INSTANCE;

    @Test
    public void vendorToVendorDto() {
        Vendor vendor = new Vendor();
        vendor.setName(VENDOR_NAME);

        VendorDTO vendorDTO = vendorMapper.vendorToVendorDto(vendor);

        assertEquals(VENDOR_NAME,vendorDTO.getName());
    }

    @Test
    public void vendorDtoToVendor() {
        VendorDTO vendorDTO = new VendorDTO();
        vendorDTO.setName(VENDOR_NAME);

        Vendor vendor = vendorMapper.vendorDtoToVendor(vendorDTO);

        assertEquals(VENDOR_NAME, vendor.getName());
    }
}