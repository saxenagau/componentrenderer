/**
 * Licensed under the Apache License,Version2.0(the"License");you may not
 * use this file except in compliance with the License.You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,software
 * distributed under the License is distributed on an"AS IS"BASIS,WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND,either express or implied.See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package de.datenhahn.vaadin.componentrenderer;

import com.vaadin.v7.ui.Grid;

/**
 * An extension which allows to focus components (or its input field) inside a component
 * rendered grid cell.
 *
 * <ul>
 * <li>Navigate through the grid using the ARROW-keys (this will move the grid cursor)</li>
 * <li>Press ENTER to focus the component inside the cell. If the component contains an
 * input field, the input field is focused so its content can be changed
 * </li>
 * <li>Press ESC to leave the focus of the component to resume with navigating through
 * the grid using the ARROW keys
 * </li>
 * </ul>
 *
 * @author Jonas Hahn (jonas.hahn@datenhahn.de)
 */
public class ComponentCellKeyExtension extends Grid.AbstractGridExtension {

    private ComponentCellKeyExtension(final Grid grid) {
        super.extend(grid);
    }

    public static ComponentCellKeyExtension extend(Grid grid) {
        return new ComponentCellKeyExtension(grid);
    }

}