package mapped;

import net.minecraft.resources.data.IMetadataSectionSerializer;
import net.minecraft.util.ResourceLocation;

import java.io.Closeable;
import java.io.InputStream;
import javax.annotation.Nullable;

public interface JSonShader extends Closeable {
   ResourceLocation method7762();

   InputStream getFile();

   @Nullable
   <T> T method7764(IMetadataSectionSerializer<T> var1);

   String method7765();
}
