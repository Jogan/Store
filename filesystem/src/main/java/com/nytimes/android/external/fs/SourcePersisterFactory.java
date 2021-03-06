package com.nytimes.android.external.fs;

import com.nytimes.android.external.fs.filesystem.FileSystemFactory;
import com.nytimes.android.external.store.base.Persister;

import java.io.File;
import java.io.IOException;

import okio.BufferedSource;

/**
 * Factory for {@link SourcePersister}
 */

public class SourcePersisterFactory {

    /**
     * Returns a new {@link BufferedSource} persister with the provided file as the root of the
     * persistence {@link com.nytimes.android.external.fs.filesystem.FileSystem}.
     * @throws IOException
     */
    public static Persister<BufferedSource> create(File root) throws IOException {
        if (root == null) throw new IllegalArgumentException("root file cannot be null.");
        return new SourcePersister(FileSystemFactory.create(root));
    }
}
