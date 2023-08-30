"""
GROUP MEMEBERS
    1. Halima Abdullahi Aminu   CST/18/SWE/00118
    2. Hauwa`u Ibrahim Jibril	CST/18/SWE/00137
    3. Jamilu Salisu	        CST/19/SWE/00409
    4. Musa Ishaka	            CST/19/SWE/00417
    5. Zainab Sarki Abubakar	CST/18/SWE/00107
"""

from collections import deque

def bfs_graph_traversal(adjacency_list, start_node):
    visited = set()              # To keep track of visited nodes
    bfs_order = []               # To store the BFS traversal order
    queue = deque([start_node])  # Initialize the queue with the start node

    while queue:
        node = queue.popleft()   # Get the next node from the queue
        if node not in visited:
            visited.add(node)     # Mark the node as visited
            bfs_order.append(node)

            # Add unvisited neighbors to the queue
            for neighbor in adjacency_list[node]:
                if neighbor not in visited:
                    queue.append(neighbor)

    return bfs_order

# Example
adjacency_list = {
    1: [2, 3],
    2: [1, 4, 5],
    3: [1, 6],
    4: [2],
    5: [2, 6],
    6: [3, 5]
}
start_node = 1
result = bfs_graph_traversal(adjacency_list, start_node)
print(result) 
