/*
 * Satin
 * Copyright (C) 2019-2022 Ladysnake
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; If not, see <https://www.gnu.org/licenses>.
 */
package ladysnake.satin.api.managed.uniform;

import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.texture.AbstractTexture;

public interface SamplerUniform {

    /**
     * Sets the value of a sampler uniform declared in json using the Opengl texture slot id (between 0 and 30).
     * @param activeTexture the active texture id to be used by the sampler
     * @see org.lwjgl.opengl.GL13#GL_TEXTURE0
     */
    void setDirect(int activeTexture);

    /**
     * Sets the value of a sampler uniform declared in json
     *
     * @param texture a texture object
     */
    void set(AbstractTexture texture);

    /**
     * Sets the value of a sampler uniform declared in json
     *
     * @param textureFbo a framebuffer which main texture will be used
     */
    void set(Framebuffer textureFbo);

    /**
     * Sets the value of a sampler uniform declared in json
     *
     * @param textureName an opengl texture name
     */
    void set(int textureName);
}
