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

public interface UniformFinder {
    /**
     * Finds a uniform declared in json
     *
     * @param uniformName the name of the uniform field in the shader source file
     */
    Uniform1i findUniform1i(String uniformName);

    /**
     * Finds a uniform declared in json
     *
     * @param uniformName the name of the uniform field in the shader source file
     */
    Uniform2i findUniform2i(String uniformName);

    /**
     * Finds a uniform declared in json
     *
     * @param uniformName the name of the uniform field in the shader source file
     */
    Uniform3i findUniform3i(String uniformName);

    /**
     * Finds a uniform declared in json
     *
     * @param uniformName the name of the uniform field in the shader source file
     */
    Uniform4i findUniform4i(String uniformName);

    /**
     * Finds a uniform declared in json
     *
     * @param uniformName the name of the uniform field in the shader source file
     */
    Uniform1f findUniform1f(String uniformName);

    /**
     * Finds a uniform declared in json
     *
     * @param uniformName the name of the uniform field in the shader source file
     */
    Uniform2f findUniform2f(String uniformName);

    /**
     * Finds a uniform declared in json
     *
     * @param uniformName the name of the uniform field in the shader source file
     */
    Uniform3f findUniform3f(String uniformName);

    /**
     * Finds a uniform declared in json
     *
     * @param uniformName the name of the uniform field in the shader source file
     */
    Uniform4f findUniform4f(String uniformName);

    /**
     * Finds a uniform declared in json
     *
     * @param uniformName the name of the uniform field in the shader source file
     */
    UniformMat4 findUniformMat4(String uniformName);

    /**
     * Finds a sampler declared in json
     * @param samplerName the name of the sampler field in the shader source file
     */
    SamplerUniform findSampler(String samplerName);

}
