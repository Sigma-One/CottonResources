/*
 * MIT License
 *
 * Copyright (c) 2018-2020 The Cotton Project
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.github.cottonmc.resources.config;

import io.github.cottonmc.resources.oregen.OreGenerationSettings;
import blue.endless.jankson.Comment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CottonResourcesConfig {
	@Comment("If true, vanilla's ore gen will be cancelled.")
	public boolean override_vanilla_generation = false;

	@Comment("Listing a resource here forces it to generate in the world, even if no mod requests it, unless it's also forbidden")
	public Set<String> enabledResources = new HashSet<>();

	@Comment("Listing a resource here forces it not to generate in the world, even if a mod requests it.")
	public Set<String> disabledResources = new HashSet<>();

	@Comment("Additional settings for ore generators. Identical to the datapack json")
	public HashMap<String, OreGenerationSettings> generators = new HashMap<>();
}
