package com.github.cao.awa.annuus.information.compressor.inaction;

import com.github.cao.awa.annuus.information.compressor.InformationCompressor;
import com.github.cao.awa.annuus.information.compressor.InformationCompressors;

public class InactionCompressor implements InformationCompressor {
    public static final InactionCompressor INSTANCE = InformationCompressors.register(new InactionCompressor());

    @Override
    public int getId() {
        return -1;
    }

    /**
     * Return the source, because inaction compressor will not compress the data.
     *
     * @param bytes data source
     *
     * @return compress result
     *
     * @author cao_awa
     *
     * @since 1.0.0
     */
    @Override
    public byte[] compress(byte[] bytes) {
        return bytes;
    }

    /**
     * Return the source, because inaction compressor will not compress the data.
     *
     * @param bytes data source
     *
     * @return decompress result
     *
     * @author cao_awa
     *
     * @since 1.0.0
     */
    @Override
    public byte[] decompress(byte[] bytes) {
        return bytes;
    }
}
