/*
 *  Tiled Map Editor, (c) 2004
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 * 
 *  Adam Turk <aturk@biggeruniverse.com>
 *  Bjorn Lindeijer <b.lindeijer@xs4all.nl>
 */

package tiled.io;


import java.io.FileFilter;
import java.io.InputStream;

import tiled.core.Map;
import tiled.core.TileSet;



public interface MapReader extends PluggableMapIO, FileFilter
{
    /**
     * Loads a map from a file.
     *
     * @param filename the filename of the map file
     * @return a tiled.core.Map object with the relevant data
     */
    public Map readMap(String filename) throws Exception;

    /**
     * Loads a tileset from a file.
     *
     * @param filename the filename of the tileset file
     * @return a tiled.core.Map object with the relevant data
     */
    public TileSet readTileset(String filename) throws Exception;
    
    /**
     * Loads a map from an already opened stream. Useful
     * for maps which are part of a larger binary dataset
     * 
     * @param in
     * @return a tiled.core.Map object with the relevant data
     * @throws Exception
     */
    public Map readMap(InputStream in) throws Exception;
    
    public TileSet readTileset(InputStream in) throws Exception;
}
