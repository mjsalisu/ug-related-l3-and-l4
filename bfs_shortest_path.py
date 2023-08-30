"""
GROUP MEMEBERS
    1. Halima Abdullahi Aminu   CST/18/SWE/00118
    2. Hauwa`u Ibrahim Jibril	CST/18/SWE/00137
    3. Jamilu Salisu	        CST/19/SWE/00409
    4. Musa Ishaka	            CST/19/SWE/00417
    5. Zainab Sarki Abubakar	CST/18/SWE/00107
"""

from collections import deque

def bfs_shortest_path(adjacency_list, start_node, end_node):
    visited = set()
    parent_map = {}
    queue = deque([start_node])

    while queue:
        node = queue.popleft()
        if node == end_node:
            break

        for neighbor in adjacency_list[node]:
            if neighbor not in visited:
                visited.add(neighbor)
                queue.append(neighbor)
                parent_map[neighbor] = node

    if end_node not in parent_map:
        return None

    path = []
    current = end_node
    while current != start_node:
        path.append(current)
        current = parent_map[current]
    path.append(start_node)
    path.reverse()

    return path

# Example
adjacency_list = {
    'A': ['B', 'C'],
    'B': ['A', 'D', 'E'],
    'C': ['A', 'F'],
    'D': ['B'],
    'E': ['B', 'F'],
    'F': ['C', 'E']
}
start_node = 'A'
end_node = 'F'
shortest_path = bfs_shortest_path(adjacency_list, start_node, end_node)
print(shortest_path) 
